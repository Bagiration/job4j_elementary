package ru.job4j.array;

//6.3. Массив заполнен true или false

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
               /*
               // старый код
               for (int i = 0; i < data.length; i++) {
                    boolean model = data[0];
                     if (model == data[i]) {
                     } else {
                        result = false;
                        break;
                    */
        // новый код
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
