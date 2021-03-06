package ru.job4j.loop;

//5.9. Крест в псевдографике.

/**
 * left - добавить условие, по которому нужно определить ставить ли символ или нет.
 * right - добавить условие, что нужно ставить элемент в правый угол.
 */
public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = (cell + row) == (size - 1);
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}











