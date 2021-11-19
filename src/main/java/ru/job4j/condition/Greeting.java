package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like java!";
        System.out.println(idea);
        idea += " But i am newbie. ";
        short year = 2021;
        idea += year;
        System.out.println(idea);
        int u = 2147483647;
        float f = u;
        int i = (int) f;
        System.out.println(f);
        System.out.println(i);
    }
}
