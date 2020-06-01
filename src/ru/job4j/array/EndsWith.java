package ru.job4j.array;

//6.4.1. Слово заканчивается на ...

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int delta = word.length - post.length;
        for (int i = word.length - 1; i > word.length - delta; i = i - 1) {
            if (word[i] != post[i - delta]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
