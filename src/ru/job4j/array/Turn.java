package ru.job4j.array;

//6.2.3. Перевернуть массив.

public class Turn {
    public static int[] back(int[] array) {
        int limit = array.length / 2;
        for (int i = 0; i < limit; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
