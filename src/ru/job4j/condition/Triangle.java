package ru.job4j.condition;

//4.3.1. А существует ли треугольник? [#285265]

/**
 * Первоначальный код был таков:
 * public static boolean exist(double ab, double ac, double bc) {
 * if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
 * return true;
 * } else {
 * return false;
 * }
 * }
 */
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        boolean result = exist(2.0, 2.0, 3.0);
        System.out.println(result);
    }
}
