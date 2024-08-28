package org.example;

public class ArrayOfInt {

    // array of numbers
    private int[] numbers;


    // constructor
    public ArrayOfInt(int[] numbers) {
        this.numbers = numbers;

    }

    // method to find the difference between the largest and smallest

    public int getDifference() {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("not valid");
        }

        int min = numbers[0];
        int max = numbers[0];

        // loop through the array
        for (int number: numbers ) {
            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }
        // return the difference

        return max - min;
    }


}
