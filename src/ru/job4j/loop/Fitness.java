package ru.job4j.loop;

//5.4. Протеиновая диета. [#285343]

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan  <= nik ) {
            ivan = ivan * 3;
            nik = nik * 2;
            month = month + 1;
        }
        return month;
    }
/*
    public static void main(String[] args) {
        int Result = calc(90, 100);
        System.out.println(Result);
    }
     */
}
