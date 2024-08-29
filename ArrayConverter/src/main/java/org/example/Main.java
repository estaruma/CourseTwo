// Write a Java program to convert an array to an ArrayList.

package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayConverter converter = new ArrayConverter();

        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = converter.convertArrayToList(array);
        System.out.println("ArrayList: " + arrayList);
    }
}