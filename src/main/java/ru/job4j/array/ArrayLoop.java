package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayLoop = new int[5];
        for (int i = 0; i < arrayLoop.length; i++) {
            arrayLoop[i] = i * 2 + 3;
        }
        for (int element : arrayLoop) {
            System.out.println(element);

        }
    }
}
