package org.example;

// Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
public class Main {
    public static void main(String[] args) {
        int testNumber = 5;

        try {
            NumberChecker.checkEven(testNumber);
        } catch (OddNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}