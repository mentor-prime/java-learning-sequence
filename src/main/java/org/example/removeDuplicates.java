package org.example;

public class removeDuplicates {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "afgh";
        System.out.println("String after removing duplicates: " + removeDups(merge(a, b)));
        System.out.println("String after removing duplicates: " + remd(merge(a, b)));
    }

    public static String merge(String a, String b) {
        String result = a + b;
        System.out.println("Merged String: " + result);
        return result;
    }

    public static String removeDups(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            boolean isDuplicate = false;

            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (string.charAt(i) == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to result
            if (!isDuplicate) {
                result += string.charAt(i);
            }
        }

        return result;
    }

    public static String remd(String string) {
        char[] originalString = string.toCharArray();
        String result = "";

        for (int i = 0; i < originalString.length; i++) {
            boolean isDuplicate = false;

            // Check if character already exists in result string
            for (int j = 0; j < result.length(); j++) {
                if (originalString[i] == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to result
            if (!isDuplicate) {
                result += originalString[i];
            }
        }

        return result;
    }
}