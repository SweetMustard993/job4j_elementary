package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int column = 0; column < width; column++) {
            for (int row = 0; row < height; row++) {
                if ((column + row) % 2 == 0) {
                    System.out.print(" X");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(10, 10);
    }
}