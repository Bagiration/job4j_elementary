package ru.job4j.condition;

//4.2. Тернарное сравнение
public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        int result = third >  temp ? third : temp;
        return result;
    }

    public static int max(int first, int second, int third, int four) {
        int temp = max(first, second, third);
        int result = four > temp ? four : temp;
        return result;
    }


    public static void main(String[] args) {
        int msg = max(21, 22);
        System.out.println(msg);
    }
}
