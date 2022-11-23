import java.util.Scanner;

/*
1. Напишите программу, чтобы проверить, содержит ли данная строка только цифры.
    (с возможностью ввода или нет решайте сами)
2  Напишитепрограмму для объединения данной строки с самим собой заданное количество раз
    (количество и строку мы вводим)
*/
public class Main {
    private static void uniteStr(String inString, int count){
        System.out.println(String.valueOf(inString).repeat(count));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sourceString = "Some data string";
        int i = 0;

        while (i < sourceString.length()) {
            if (Character.isDigit(sourceString.charAt(i))) {
                System.out.println("Digits are present in the source string.");
                break;
            }
            i++;
        }
        if (i == sourceString.length()){
            System.out.println("No digits.");
        }

        System.out.print("Input some string: ");
        String inString = in.nextLine();
        System.out.print("Input count: ");
        int cnt = in.nextInt();

        uniteStr(inString, cnt);
    }
}