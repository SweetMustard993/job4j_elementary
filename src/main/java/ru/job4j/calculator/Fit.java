package ru.job4j.calculator;

public class Fit {

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight((short) 157);
        System.out.println("Woman 157 is " + woman);
    }

}