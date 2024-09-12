package org.example;

public class NumberChecker {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + ": is odd.");
        } else {
            System.out.println(number + ": is even.");
        }
    }
}
