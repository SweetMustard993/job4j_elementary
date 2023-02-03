package ru.job4j.early;

import java.util.Scanner;

public class TestGraphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char sim = '8';
        String strDo = "";
        int j = 0;
        for (int i = 0; i < a; i++) {
            System.out.print(strDo);
            for (int k = j; k < a; k++) {
                System.out.print(sim);
            }
            j = i >= a / 2 ? j - 2 : j + 2;
            if (i >= (a / 2) && strDo.length() != 0) {
                strDo = strDo.substring(0, strDo.length() - 1);
            } else {
                strDo += " ";
            }
            System.out.println("");
        }
    }
}
