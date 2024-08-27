// Write a Java program that takes three numbers from the user and prints the greatest number.
package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            GreaterNumber greaterNumber = new GreaterNumber();

            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Enter the third number: ");
            int num3 = scanner.nextInt();

            int greater = greaterNumber.findGreatestNumber(num1, num2, num3);

            System.out.println("The greatest number is: " + greater);

            scanner.close();

    }
}