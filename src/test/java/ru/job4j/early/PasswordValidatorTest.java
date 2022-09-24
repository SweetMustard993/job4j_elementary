package ru.job4j.early;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordValidatorTest {

    @Test
    public void validateWhenNull() {
        String password = null;
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние не должно быть пустым");
    }

    @Test
    public void validateWhenLengthLess8() {
        String password = "|pin1";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние должно быть в диапазоне [8, 32]");
    }

    @Test
    public void validateWhenLengthMore32() {
        String password = "|ultraSuperExtraLongLengthInTheWorldPin1";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние должно быть в диапазоне [8, 32]");
    }

    @Test
    public void validateWhenHasNotUpperRegister() {
        String password = "ultrasuperextra1}";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние должно иметь хотя бы один символ в верхнем регистре");
    }

    @Test
    public void validateWhenHasNotLowerRegister() {
        String password = "SUPERMEGAPASS1|";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние должно иметь хотя бы один символ в нижннем регистре");
    }

    @Test
    public void validateWhenHasNotDigit() {
        String password = "SuperMEGAPASS|";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние должно иметь хотя бы один символ являющицся цифрой");
    }

    @Test
    public void validateWhenHasNotSpecialCharacter() {
        String password = "SuperMEGAPASS1";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значенние должно иметь хотя бы один спец символ");
    }

    @Test
    public void validateWhenHasNotillegalSubString() {
        String password = "|SuperMEGAPASS1qwErty";
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> PasswordValidator.validate(password));
        assertEquals(throwable.getMessage(), "значение не должно содержать следующие последовательности: qwerty, 12345, password, admin, user");
    }
}