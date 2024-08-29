// Write a Java program to find common elements between two arrays (string values).

package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"grape", "fig", "banana", "kiwi", "lemon"};

        CommonElementsFinder finder = new CommonElementsFinder();
        List<String> commonElements = finder.findCommonElements(array1, array2);

        System.out.println("Common elements: " + commonElements);
    }
}

