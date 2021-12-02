package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] arrayShort = new short[10];
        System.out.println("Длина массива arrayShort [" + arrayShort.length + "]");
        String[] arrayString = new String[100500];
        System.out.println("Длина массива arrayString [" + arrayString.length + "]");
        float[] arrayFloat = new float[40];
        System.out.println("Длина массива arrayFloat [" + arrayString.length + "]");
        String[] names = new String[4];
        names[0] = "Петр";
        names[1] = "Богдан";
        names[2] = "Кристина";
        names[3] = "Анастасия";
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println("Значение ячейки c с индексом [" + i + "] - " + names[i]);
        }
    }
}
