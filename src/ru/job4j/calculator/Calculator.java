package ru.job4j.calculator;

public class Calculator {

     public static void main (String[] args) {
      int one = 1;
      int two = 2;
      int onePlusTwo = one + two;
        // доп. задание
      int six = 6;
      int four = 4;
     int five = 5;
     int sixDivTwo = six / two;
    int fiveMinusTwo = two - five;
      int fourTimeTwo = four * two;

     System.out.println(onePlusTwo);
     System.out.println(sixDivTwo);
     System.out.println(fiveMinusTwo);
     System.out.println(fourTimeTwo);
    }
}

  /*
   // еще 1 варик кода
   public static void main (String[] args) {
       Calculator.sayHello("Вася");
   }


    public static void sayHello (String name) {
 System.out.println("Привет, " + name + "!");
    }
}


/*
    // 4. Методы [#285301] (второй варик)
    public static void main (String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }


    public static void plus (int one, int two) {
        System.out.println(one);
        System.out.println(two);
    }


}*/

/*
    // 4. Методы [#285301] (первый варик)
    public static void plus (int one, int two) {

        System.out.println(one);
        System.out.println(two);
    }
    public static void main (String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
} */
