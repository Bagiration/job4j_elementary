package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value/60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int a=140;
        int b=120;
        int euro = Converter.rubleToEuro(a);
        int dollar = Converter.rubleToDollar(b);
        System.out.println(a + " rubles are " + euro + " euro.");
        System.out.println(b + " rubles are " + dollar + " dollar.");
    }


}
