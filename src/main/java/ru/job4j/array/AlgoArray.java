package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            for (int j = i; j <= array.length - 1; j++) {
                if (array[j] < min) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
        for (int elemnt : array) {
            System.out.println(elemnt);
        }
    }
}