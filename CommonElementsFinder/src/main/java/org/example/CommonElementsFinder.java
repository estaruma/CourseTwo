package org.example;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsFinder {
    public List<String> findCommonElements(String[] array1, String[] array2) {
        List<String> commonElements = new ArrayList<>();

        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2) && !commonElements.contains(element1)) {
                    commonElements.add(element1);
                }
            }
        }

        return commonElements;
    }
}

