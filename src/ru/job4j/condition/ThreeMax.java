package ru.job4j.condition;
//4.5. Отладка программы в IDEA [#285257]
public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }
}
