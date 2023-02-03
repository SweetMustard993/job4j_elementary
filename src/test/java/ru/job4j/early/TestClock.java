package ru.job4j.early;

import java.util.Scanner;

public class TestClock {
    public static void main(String[] args) {
        clock(3);
    }

    public static void clock(int amountGr) {
        int amountGrade = amountGr;
        char grain = '8';
        StringBuilder strGrade = new StringBuilder("");
        int countGrade = 0;
        sand(amountGrade, countGrade, strGrade, grain);
    }

    private static void sand(int amountGrade, int countGrade, StringBuilder strGrade, char grain) {
        if (countGrade < amountGrade) {
            System.out.print(strGrade);
            for (int indexGrain = countGrade; indexGrain < amountGrade; indexGrain++) {
                System.out.print(grain);
            }
            countGrade += 2;
            strGrade.append(" ");
            if (countGrade < amountGrade) {
                System.out.println();
                sand(amountGrade, countGrade, strGrade, grain);
            }
            System.out.println();
        }
        countGrade -= 2;
        if (strGrade.length() - 1 >= 0) {
            strGrade.deleteCharAt(strGrade.length() - 1);
        }
        System.out.print(strGrade);
        for (int indexGrain = countGrade; indexGrain < amountGrade; indexGrain++) {
            System.out.print(grain);
        }
    }
}
