package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            System.out.println("значение индекса " + i);
            if (post[post.length - 1] != word[word.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}