package org.example.duplicates;

public class removeDuplicates2 {

    public static void main(String[] args) {
        String a = "abccdeed";
        System.out.println(removeDuplicates(a));
    }

    public static String removeDuplicates(String word) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}