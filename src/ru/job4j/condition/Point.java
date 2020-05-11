package ru.job4j.condition;

public class Point {
    // public static double distance(double x1, double y1, double x2, double y2) {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

   /* public static void main(String[] args) {
        double x1=1.2345;
        double x2=2;
        double y1=4;
        double y2=0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("distance from " + "(" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") is " + result);
    }
*/
   public static void main(String[] args) {
       int x1 = 1;
       int x2 = 2;
       int y1 = 4;
       int y2 = 0;
       double result = Point.distance(x1, y1, x2, y2);
       System.out.println("distance from " + "(" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") is " + result);
   }

}