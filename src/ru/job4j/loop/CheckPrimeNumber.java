package ru.job4j.loop;

//5.6. Простые числа. [#285344]
public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        if (number == 1) {
            return prime = false;
        } else {
            return prime;
        }
    }
}
