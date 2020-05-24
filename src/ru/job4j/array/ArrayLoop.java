package ru.job4j.array;

//6.0.3. Массивы и цикл for

public class ArrayLoop {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 3;
            System.out.println(array[i]);
        }
    }
}



