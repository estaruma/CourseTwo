package org.example;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();

        String input = reader.getInput();

        if (input != null) {
            System.out.println("You wrote: " + input);
        }
    }
    }