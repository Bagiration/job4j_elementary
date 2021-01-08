package ru.job4j.calculator;
// 4.1. Результат работы метода. [#285303]
public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        System.out.println(y);
        return y;
    }
        public static void main(String[] args) {
          int result = MathFunc.func1(100);
    }
}
