package org.example;

import java.util.Scanner;

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
