public class TestStringMethod7 {
    public static void main(String args[]) {
        char[] Str1 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
        String Str2 = "";

        Str2 = Str2.copyValueOf(Str1);
        System.out.println("Возвращаемая строка: " + Str2);

        Str2 = Str2.copyValueOf(Str1, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);
    }
}
