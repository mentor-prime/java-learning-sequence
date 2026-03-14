package org.example.string;

public class replaceFunction2 {
    public static void main(String[] args) {
        String string = "123_123_123";
        System.out.println("output: " + replaceFunction(string, "_123_")); // comment this line
    }

    public static String replaceFunction(String string, String regex) {
        String result = string.replace(regex, "");
        return result;
    }
}
