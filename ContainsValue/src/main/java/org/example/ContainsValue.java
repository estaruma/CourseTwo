package org.example;

public class ContainsValue {
    private int[] array;

    // constructor

    public ContainsValue(int[] array) {
        this.array = array;
    }

    // method to check specific value in array

    public boolean contains(int value) {
        for (int item : array) {
            if(item == value) {
                return true;
            }
        }
        return false;
    }
}
