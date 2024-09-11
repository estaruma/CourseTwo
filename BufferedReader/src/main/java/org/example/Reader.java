package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    private BufferedReader reader;

    public Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInput() {
        System.out.print("Write: ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Error");
            return null;
        }
    }
}
