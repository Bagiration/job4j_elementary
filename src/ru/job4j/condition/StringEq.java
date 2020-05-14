package ru.job4j.condition;


//4.1.0. Операторы сравнения в String

public class StringEq {
   /* public static void main(String[] args) {

        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = "JAvaRush - лучший сайт для изучения Java!";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }*/

        public static boolean check(String login) {
          //  String root = "root";
            String root = new String("root");
            boolean access = root.equals(login);
            return access;
        }
        public static void main(String[] args) {
            String your = "your_name";
            boolean userHasAccess = StringEq.check(your);
            System.out.println(userHasAccess);
        }

}
