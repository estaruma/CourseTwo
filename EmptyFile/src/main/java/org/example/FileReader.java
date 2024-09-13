package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public void readFile(String fileName) throws IOException {
        File file = new File(fileName);

        if (file.length() == 0) {
            throw new IOException("empty");
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new IOException("Not found: " + e.getMessage());
        }
    }
}
