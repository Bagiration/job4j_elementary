package ru.job4j.condition;

//4.1.2. Глупый бот. [#285254]

public class DummyBot {

//Старый вариант
  /*  public static String answer(String quastion) {
        String rs1 = "Привет, умник.";
        String rs2 = "До скорой встречи.";
        String rs3 = "Это ставит меня в тупик. Задайте другой вопрос.";
        // String rs4 = "временно";
        String rs4;
        if ("Привет, Бот.".equals(quastion)) {
            rs4 = rs1;
        } else if ("Пока.".equals(quastion)) {
            rs4 = rs2;
        } else {
            rs4 = rs3;
        }
        return rs4;
    }*/

    // Переработанный код
    public static String answer(String quastion) {
        String rs1 = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(quastion)) {
            rs1 = "Привет, умник.";
        } else if ("Пока.".equals(quastion)) {
            rs1 = "До скорой встречи.";
        }
        return rs1;
    }

    public static void main(String[] args) {
        String myQuastion = "Пока.";
        String Result = answer(myQuastion);
        System.out.println(Result);
    }
}