package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double perSum;
        while (amount > 0) {
            perSum = amount * (percent / 100);
            amount = amount + perSum - salary;
            year++;
        }
        return year;
    }
}