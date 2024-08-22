package org.example;

// Write a Java program that reverses all odd-length words in a string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordReverser wordReverser = new WordReverser();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = wordReverser.reverseOddLengthWords(input);

        System.out.println("Reversed string:");
        System.out.println(result);

        scanner.close();
    }
}