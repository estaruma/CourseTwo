package org.example;

import java.util.ArrayList;

public class ArrayConverter {
    public ArrayList<Integer> convertArrayToList(int[] array) {
        // empty list
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Loop through the array and add each element to the ArrayList
        for (int i : array) {
            arrayList.add(i);
        }

        return arrayList;
    }
}



