package ru.job4j.array;

//6.6.1. Двухмерный массив. Вывод на консоль

/**
 * "топорное" заполнение двухмерного массива
 * array[0][0] = 1;
 * array[0][1] = 2;
 * array[0][2] = 3;
 * array[1][0] = 4;
 * array[1][1] = 5;
 * array[1][2] = 6;
 * array[2][0] = 7;
 * array[2][1] = 8;
 * array[2][2] = 9;
 */

public class BarleyBreak {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int[][] array = new int[a][b];
        int k = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
