// Write a Java program to read file content line by line.

package org.example;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.txt";

        FileReader fileReader = new FileReader(filePath);
        fileReader.readFile();
    }
}