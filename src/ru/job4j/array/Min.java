package ru.job4j.array;

//6.5.1. Поиск минимального числа в массиве

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
