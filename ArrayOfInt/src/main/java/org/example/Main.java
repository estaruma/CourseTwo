// 28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.


package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 45, 67, 98};

        ArrayOfInt arrayOfInt = new ArrayOfInt(numbers);

        // get difference - largest/ smallest

        int difference = arrayOfInt.getDifference();

        System.out.println(difference);
    }
}