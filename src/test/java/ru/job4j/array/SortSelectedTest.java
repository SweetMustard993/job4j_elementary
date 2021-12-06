package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when736Sort() {
        int[] data = new int[] {7, 3, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when94371Sort() {
        int[] data = new int[] {9, 4, 3, 7, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}