package ru.job4j.array;

//6.5.3. Сортировка выборкой

/**
 * блок через временную переменную
 * int temp = data[i];
 * data[i] = min;
 * data[index] = temp;
 */

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            if (i != index) {
                data[index] = data[i];
                data[i] = min;
            }
        }
        return data;
    }
}
