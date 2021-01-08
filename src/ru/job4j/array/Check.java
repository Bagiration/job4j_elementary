package ru.job4j.array;

//6.3. Массив заполнен true или false

/**
 * старый код:
 * старый код
 * for (int i = 0; i < data.length; i++) {
 * boolean model = data[0];
 * if (model == data[i]) {
 * } else {
 * result = false;
 * break;
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean model = data[0];
            if (model != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
