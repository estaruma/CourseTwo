package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        try {
            System.out.println("Enter numbers and done to finish");

            while (true) {
                String input = scanner.next();

                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    if (!numbers.add(number)) {
                        throw new DuplicateNumberException("Duplicate number found: " + number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid or done to finish");
                }
            }


            System.out.println("No duplicates found");

        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
