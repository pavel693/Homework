package ua.od.hillel;

public class DifferentString {
    public static void main(String args[]) {
        String str1 = "Strings are immutable";
        String str2 = "Strings are immutable";
        String str3 = "Integers are not immutable asdfdsafsadfadfs";


        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);
    }
}
