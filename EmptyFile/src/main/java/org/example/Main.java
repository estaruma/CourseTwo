package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile(fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}