package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double s = (Math.pow(p/(2*(k+1)),2))*k;
        //double rsl = -1;
        return s;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println(" Square with parameters " +  p + " and " +  k + " equal is " + result1);
    }



}
