package org.example;

// 1. Write a Java program that throws an exception and catch it using a try-catch block.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        try {
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}