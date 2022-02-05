package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfThree3To1Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To5Then5() {
        int first = 1;
        int second = 4;
        int third = 3;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int first = 3;
        int second = 3;
        int third = 3;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

}