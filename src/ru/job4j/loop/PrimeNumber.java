package ru.job4j.loop;

//5.6. Простые числа. [#285344]

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i) == true) {
                count = count + 1;
            }
        }
        return count;
    }
   }