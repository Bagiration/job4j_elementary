package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Старый код (без подхода ООП):
 * public static double distance(int x1, int y1, int x2, int y2) {
 * double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
 * return rsl;
 * }
 * <p>
 * <p>
 * public static void main(String[] args) {
 * int x1 = 1;
 * int x2 = 2;
 * int y1 = 4;
 * int y2 = 0;
 * double result = Point.distance(x1, y1, x2, y2);
 * System.out.println("distance from " + "(" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") is " + result);
 * <p>
 * // Тест кода проверки расстояния
 * int inx1 = 1;
 * int iny1 = 4;
 * int inx2 = 2;
 * int iny2 = 0;
 * double expected = 4.123105;
 * double out = distance(inx1, iny1, inx2, iny2);
 * boolean passed = expected == out;
 * System.out.println("The distance between two points with coordinates " + "(" + inx1 + "," + iny1 + "), (" + inx2 + "," + iny2 + ") is " + expected + ". Test result:  " + passed);
 * }
 */

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(x - that.x, 2) + pow(y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
