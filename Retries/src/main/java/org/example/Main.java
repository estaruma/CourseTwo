package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxRetries = 5;
        int attempts = 0;
        boolean success = false;

        while (attempts < maxRetries) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                System.out.println("You entered: " + input);
                success = true;
                break; // Exit if sucsess
            } else {
                System.out.println("Invalid input. Try again.");
                scanner.next();
                attempts++;
            }
        }

        if (!success) {
            System.out.println("errors");
        }

        scanner.close();
    }
}
    }
}