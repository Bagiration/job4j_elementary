package ru.job4j.condition;
//4.5. Отладка программы в IDEA [#285257]
public class ProbSqArea {
            public static int square(int p, int k) {
            int h = p / (2 * (k + 1));
            int w = k * h;
            int s = w * h;
            return s;
        }
    }
