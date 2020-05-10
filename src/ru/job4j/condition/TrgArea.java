package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p=0.5*(a+b+c);
        double tArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return tArea;
    }

    public static void main(String[] args) {
        double resalt = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + resalt);
    }



}
