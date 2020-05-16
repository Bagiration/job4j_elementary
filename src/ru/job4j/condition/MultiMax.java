package ru.job4j.condition;

//4.4. Максимум из трех чисел [#285263]

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result1 = first > second ? first : second;
        int result2 = result1 > third ? result1 : third;
        return result2;

    }

    public static void main(String[] args) {

        int result3 = max(7, 4, 3);
        System.out.println(result3);
    }
}
