package ru.job4j.loop;

//5.6. Простые числа. [#285344]
public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
