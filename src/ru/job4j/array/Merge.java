package ru.job4j.array;

import java.util.Arrays;

//тестовое задание к первому экзамену

public class Merge {

    //тест через вывод на консоль
    public static void main(String[] args) {
        int[] a = {2, 10, 25};
        int[] b = {3, 5, 12, 10000};
        int lenght = a.length + b.length;
        //if (a[0] >= b[b.length - 1] || b[0] >= a[a.length - 1]) {
        int[] result = newMerge(a, b);
        for (int i = 0; i < lenght; i++) {
            System.out.print(result[i] + " ");

        }
    }

    public static int[] newMerge(int[] a, int[] b) {
        int ia, ib;
        ia = ib = 0;
        int[] rsl = new int[a.length + b.length];
        while (ia + ib < a.length + b.length) {
            if (ia == a.length) {
                rsl[ia + ib] = b[ib];
                ib++;
            } else {
                if (ib == b.length) {
                    rsl[ia + ib] = a[ia];
                    ia++;
                } else {
                    if (a[ia] < b[ib]) {
                        rsl[ia + ib] = a[ia];
                        ia++;
                    } else {
                        rsl[ia + ib] = b[ib];
                        ib++;

                    }
                }
            }
        }
        return rsl;
    }
}




/* это всё старый код

public static void main(String[] args) {
        int[] a = {};
        int[] b = {5200, 10000};
        int lenght = a.length + b.length;
        if (a[0] >= b[b.length - 1] || b[0] >= a[a.length - 1]) {
            int[] result1 = simpleMerge(a, b);
            for (int i = 0; i < lenght; i++) {
                System.out.print(result1[i] + " ");
            }
        } else {
            int[] result1 = universalMerge(a, b);
            for (int i = 0; i < lenght; i++) {
                System.out.print(result1[i] + " ");
            }
        }
    }

    //метод для юнит - теста
    public static int[] forTest(int[] a, int[] b) {
        int length = a.length + b.length;                                       //O(1)
        int[] result = new int[length];                                         //O(n)
        if (a.length == 0 || b.length == 0) {                                   //O(1)
            return result = universalMerge(a, b);                               //O(1)
        } else {
            if (a[0] >= b[b.length - 1] || b[0] >= a[a.length - 1]) {           //O(1)
                return result = simpleMerge(a, b);                              //O(1)
            } else {
                return result = universalMerge(a, b);                           //O(1)
            }
        }
    }

    //метод простой комбинации массивов по возрастанию
    public static int[] simpleMerge(int[] a, int[] b) {                          //O(1)
        //int[] result = new int[a.length + b.length];
        int length = a.length + b.length;                                        //O(1)
        int[] newArray = new int[length];                                        //O(n)
        if (a[0] >= b[b.length - 1]) {                                           //O(1)
            // reWrite(b, a);
            for (int i = 0; i < b.length; i++) {                                 //O(n)
                newArray[i] = b[i];                                              //O(n)
            }
            for (int i = b.length; i < (a.length + b.length); i++) {             //O(n)
                newArray[i] = a[i - b.length];                                   //O(n)
            }
        } else {
            if (b[0] >= a[a.length - 1]) {                                       //O(1)
                for (int i = 0; i < a.length; i++) {                             //O(1)
                    newArray[i] = a[i];                                          //O(n)
                }
                for (int i = a.length; i < (a.length + b.length); i++) {         //O(n)
                    newArray[i] = b[i - a.length];                               //O(n)
                }
            }
        }
        return newArray;
    }



    // универсальный метод подбора возрастающих массивов
    public static int[] universalMerge(int[] a, int[] b) {
        int bi = 0;                                                               //O(1)
        int ai = 0;                                                               //O(1)
        int length = a.length + b.length;                                         //O(1)
        int[] rsl = new int[length];                                              //O(n)
        for (int i = 0; i < length; i++) {
            if (ai < a.length && bi < b.length && a[ai] <= b[bi]) {               //O(n)
                rsl[i] = a[ai];                                                   //O(n)
                ai++;                                                             //O(n)
            } else {
                if (ai < a.length && bi < b.length && b[bi] <= a[ai]) {           //O(1)
                    rsl[i] = b[bi];                                               //O(1)
                    bi++;
                } else {
                    if ((bi >= b.length - 1) && ai < a.length) {                  //O(1)
                        rsl[i] = a[ai];                                           //O(n)
                        ai++;                                                     //O(n)
                    } else {
                        if ((ai >= a.length - 1) && bi < b.length) {              //O(1)
                            rsl[i] = b[bi];                                       //O(n)
                            bi++;                                                 //O(n)
                        }
                    }
                }
            }
        }
        return rsl;
    }
*/

//дальше идёт код с комбинировынным кодом в одном методе, впринципе всё тоже самое//

//тест с выводом на консоль
/*public static void main(String[] args) {
        int[] n = {};
        int[] v = {45, 200, 10000};
        int lenght = v.length + n.length;
        //int[] result1 = mergeOne(v, n);
        int[] result1 = merge(v, n);
        for (int i = 0; i < lenght; i++) {
            System.out.print(result1[i] + " ");
        }
    }




    //метод включающий в себя комбинированный код с двумя алгаритмами
    public static int[] merge(int[] a, int[] b) {

        int bi = 0;
        int ai = 0;
        int length = a.length + b.length;
        int[] rsl = new int[length];
        if (a[0] >= b[b.length - 1]) {
// если первый элемент один из двух массивов больше, чем последний элемент один из массивов,
            //то просто переписываем элементы массивов по возрастанию без переборки
            for (int i = 0; i < b.length; i++) {
                rsl[i] = b[i];
            }
            for (int i = b.length; i < (a.length + b.length); i++) {
                rsl[i] = a[i - b.length];
            }
        } else {
            if (b[0] >= a[a.length - 1]) {
                for (int i = 0; i < a.length; i++) {
                    rsl[i] = a[i];
                }
                for (int i = a.length; i < (a.length + b.length); i++) {
                    rsl[i] = b[i - a.length];
                }

            } else {
                if (a[0] < b[b.length - 1] || b[0] < a[a.length - 1]) {
                    // дальше идёт код универсальной переборки

                    for (int i = 0; i < length; i++) {
                        if (ai < a.length && bi < b.length && a[ai] <= b[bi]) {
                            rsl[i] = a[ai];
                            ai++;
                        } else {
                            if (ai < a.length && bi < b.length && b[bi] <= a[ai]) {
                                rsl[i] = b[bi];
                                bi++;
                            } else {
                                if ((bi >= b.length - 1) && ai < a.length) {
                                    rsl[i] = a[ai];
                                    ai++;
                                } else {
                                    if ((ai >= a.length - 1) && bi < b.length) {
                                        rsl[i] = b[bi];
                                        bi++;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        return rsl;
    }

}
*/


