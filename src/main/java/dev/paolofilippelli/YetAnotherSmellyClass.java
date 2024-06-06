package dev.paolofilippelli;

import java.util.*;
import java.io.*;

public class YetAnotherSmellyClass {
    private static Map<String, String> map = new HashMap<String, String>();
    private static int threshold = 10;
    private static boolean flag = false;

    public static void main(String[] args) {
        YetAnotherSmellyClass instance = new YetAnotherSmellyClass();
        instance.processInput();
        instance.writeToFile("output.txt", "Hello, World!");
        instance.calculateSum(5, 10);
        instance.unusedPrivateMethod();
    }

    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key-value pairs (key:value): ");
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(":");
            if (parts.length == 2) {
                map.put(parts[0], parts[1]);
            } else {
                System.out.println("Invalid input format. Please enter in key:value format.");
            }
            if (map.size() > threshold) {
                System.out.println("Threshold exceeded!");
                break;
            }
        }
    }

    public void writeToFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int calculateSum(int a, int b) {
        int sum = a + b;
        if (flag) {
            System.out.println("Flag is set!");
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

    private void unusedPrivateMethod() {
        System.out.println("This is an unused private method");
    }
}

class RedundantClass {
    public void performAction() {
        System.out.println("Performing action in RedundantClass");
    }

    public void emptyMethod() {
        // This method intentionally left blank
    }
}
