package ru.job4j.condition;

//0. Операции сравнения [#285259]

public class Liken {


    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result1 = first > second;
        boolean result2 = first < second;
        boolean result3 = first == second;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        possibleDiv(-5);
    }

    //4.1. Операторы ветвлений [#285264]
    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
