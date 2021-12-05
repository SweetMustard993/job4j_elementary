package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenBack12345Then54321() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBack1234Then4321() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}