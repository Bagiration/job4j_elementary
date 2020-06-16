package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                //int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int a = index; a < array.length; a++) {
                    if (array[a] != null) {
                        array[index] = array[a];
                        array[a] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
