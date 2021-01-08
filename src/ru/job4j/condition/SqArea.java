package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println(" Square with parameters " + p + " and " + k + " equal is " + result1);
        System.out.println(" The formula for calculate square  is S=(p/(2*(k+1))^2)*k");

        // Тест кода
        int inp = 6;
        int ink = 2;
        int expected = 2;
        double out = square(inp, ink);
        boolean passed = expected == out;
        System.out.println("The area with parameters " + inp + " and " + ink + " is " + expected + ". Test result: " + passed);
    }
}
