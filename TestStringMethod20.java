public class TestStringMethod20 {

        public static void main(String args[]) {
            String Str1 = new String("Добро пожаловать на ProgLang.su");
            String Str2 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");

            System.out.print("Каноническое представление Str1: ");
            System.out.println(Str1.intern());

            System.out.print("Каноническое представление Str2: ");
            System.out.println(Str2.intern());
        }
    }
