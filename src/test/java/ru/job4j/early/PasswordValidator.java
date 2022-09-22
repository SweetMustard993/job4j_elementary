package ru.job4j.early;

public class PasswordValidator {

    @SuppressWarnings("checkstyle:OperatorWrap")
    public static String validate(String password) {
        char[] chArray = password.toCharArray();
        if (password.equals(null)) {
            throw new IllegalArgumentException("значенние не должнобыть пустым");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("значенние должно быть в диапазоне [8, 32]");
        }
        boolean isUpperRegister = false;
        for (Character character : chArray) {
            isUpperRegister = Character.isUpperCase(character);
            if (isUpperRegister) {
                break;
            }
        }
        if (!isUpperRegister) {
            throw new IllegalArgumentException("значенние должно иметь хотя бы один символ в верхнем регистре");
        }
        boolean lowerRegister = false;
        for (Character character : chArray) {
            lowerRegister = Character.isLowerCase(character);
            if (lowerRegister) {
                break;
            }
        }
        if (!lowerRegister) {
            throw new IllegalArgumentException("значенние должно иметь хотя бы один символ в нижннем регистре");
        }
        boolean isNumber = false;
        for (Character character : chArray) {
            isNumber = Character.isDigit(character);
            if (isNumber) {
                break;
            }
        }
        if (!isNumber) {
            throw new IllegalArgumentException("значенние должно иметь хотя бы один символ являющицся цифрой");
        }
        boolean isSpecialCharacter = false;
        for (Character character : chArray) {
            isSpecialCharacter = !Character.isDigit(character) && Character.isAlphabetic(character);
            if (isSpecialCharacter) {
                break;
            }
        }
        if (!isSpecialCharacter) {
            throw new IllegalArgumentException("значенние должно иметь хотя бы один символ являющицся цифрой");
        }
        if (password.contains("qwerty") || password.contains("12345") || password.contains("password")
                || password.contains("admin") || password.contains("user")) {
            throw new IllegalArgumentException("значение не должно содержать следующие послежовательности: "
                    + "qwerty, 12345, password, admin, user");
        }
        return password;
    }

}