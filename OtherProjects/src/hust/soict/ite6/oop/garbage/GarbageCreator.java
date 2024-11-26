package hust.soict.ite6.oop.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.exe"; // Replace with the path to a large file
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char) b); // Inefficient concatenation
        }
        endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");
    }
    //make change for demonstration of the release flow
}