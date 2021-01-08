package ru.job4j.condition;

//4.2. Тернарное сравнение
public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static void main(String[] args) {
        int msg = max(21, 22);
        System.out.println(msg);
    }
}
