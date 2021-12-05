package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Длина массива arrayShort [" + ages.length + "]");
        String[] surnames = new String[100500];
        System.out.println("Длина массива arrayString [" + surnames.length + "]");
        float[] prices = new float[40];
        System.out.println("Длина массива arrayFloat [" + prices.length + "]");
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
