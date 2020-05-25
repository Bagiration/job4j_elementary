package ru.job4j.array;

//6.1. Классический поиск перебором.

public class FindLoop {
    //в методе от себя добавил слово "static"
    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
