package ru.job4j.converter;

/**
 * Class Класс для перевода курса валюты рубль на иностранную валюту (евро или доллар)
 *
 * @author Bagrat Paronyan
 */
public class Converter {
    /**
     * @param value количество рублей, по которым нужно узнать эквивалентную сумму денег в иностранной валюте в евро
     * @return результат (эквивалентная сумма денег в евро)
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * @param value количество рублей, по которым нужно узнать эквивалентную сумму денег в иностранной валюте в долларах
     * @return результат (эквивалентная сумма денег в доллорах)
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int a = 140;
        int b = 120;
        int euro = Converter.rubleToEuro(a);
        int dollar = Converter.rubleToDollar(b);
        System.out.println(a + " rubles are " + euro + " euro.");
        System.out.println(b + " rubles are " + dollar + " dollar.");

        // Тест кода евро
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println(inEuro + " rubles are " + expectedEuro + ". Test result:  " + passedEuro);

        // Тест кода бакс
        int inDollar = 120;
        int expectedDollar = 2;
        int outDollar = rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(inDollar + " rubles are " + expectedDollar + ". Test result:  " + passedDollar);
    }
}
