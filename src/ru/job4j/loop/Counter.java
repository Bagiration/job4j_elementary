package ru.job4j.loop;

//5.0.1. Сумма чисел. [#285348]
//5.1. Подсчет суммы чётных чисел в диапазоне [#285351]

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}
