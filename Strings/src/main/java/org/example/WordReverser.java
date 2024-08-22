package org.example;

public class WordReverser {

    public String reverseOddLengthWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() % 2 != 0) {
                result.append(reverseString(word));
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
