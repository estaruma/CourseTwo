package org.example;

public class DuplicateFinder {
    public void findDuplicates(String[] array) {
        boolean hasDuplicates = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    hasDuplicates = true;
                    System.out.println("Duplicate found: " + array[i]);
                    // to avoid print the same duplicate multiple times
                    break;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }

}
