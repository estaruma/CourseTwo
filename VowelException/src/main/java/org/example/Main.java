// Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.

package org.example;

import java.util.Scanner;
import org.example.NoVowelException;
import org.example.VowelChecker;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelChecker vowelChecker = new VowelChecker();

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        try {
            vowelChecker.checkForVowels(inputString);
        } catch (NoVowelException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }


}
