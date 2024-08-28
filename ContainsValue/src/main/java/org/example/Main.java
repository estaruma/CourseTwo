// 5. Write a Java program to test if an array contains a specific value.
package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arraySet = {1, 2, 3, 4, 5, 6};

        ContainsValue containsValue = new ContainsValue(arraySet);

        int checkValue = 3;

        boolean result = containsValue.contains(checkValue);

        if (result) {
            System.out.println("The array contains the value " + checkValue);
        } else {
            System.out.println("The array does not contain the value " + checkValue);
        }
    }
}