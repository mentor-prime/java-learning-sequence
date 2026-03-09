package org.example.string;

public class replaceFunction {
    public static void main(String[] args) {


        String string = "java_123_selenium";

        System.out.println("output: " + replaceFunction(string, "_123_"));
    }

    public static String replaceFunction(String string, String regex) {
        String result = string.replace(regex, "");
        return result;
    }
}
