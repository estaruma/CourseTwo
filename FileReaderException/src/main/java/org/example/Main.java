package org.example;

// Write a Java program to create a method that reads a file and throws an exception if the file is not found.
import java.io.FileNotFoundException;
import static org.example.FileReaderException.readFile;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Not found: " + filePath);
        }
    }
}