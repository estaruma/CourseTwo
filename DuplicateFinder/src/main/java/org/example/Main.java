// Write a Java program to find duplicate values in an array of string values.

package org.example;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};

        DuplicateFinder duplicateFinder = new DuplicateFinder();

        duplicateFinder.findDuplicates(array1);

    }
}
