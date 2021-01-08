package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(160);
        System.out.println("The ideal weight of a man is " + man + "kg");
        System.out.println("The ideal weight of a woman is " + woman + "kg");
        System.out.println("The ideal weight formula of a man is: Ideal weight = (height - 100)*1.15 ");
        System.out.println("The ideal weight formula of a woman is: Ideal weight = (height - 110)*1.15");

        // Тест кода веса мужчины
        double inMan = 170;
        double expectedMan = 80.5;
        double outMan = manWeight(inMan);
        boolean passedMansWeight = expectedMan == outMan;
        System.out.println("The man's weight is " + inMan + " kg when his height is " + expectedMan + ". Test result:  " + passedMansWeight);

        // Тест кода веса женщины
        double inwoman = 160;
        double expectedwoman = 57.49;
        double outwoman = womanWeight(inwoman);
        boolean passedWomansWeight = expectedwoman == outwoman;
        System.out.println("The man's weight is " + inwoman + " kg when his height is " + expectedwoman + ". Test result:  " + passedWomansWeight);
    }
}
