package dev.paolofilippelli;

import java.util.*;
import java.io.*;

public class SmellyCode {
    private static List<String> list = new ArrayList<String>();
    private static final int CONSTANT = 5;
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                for (int i = 0; i < CONSTANT; i++) {
                    list.add("Even number: " + number);
                }
            } else {
                addOddNumber(number);
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
    private static void addOddNumber(int number) {
        counter++;
        System.out.println("Odd number: " + number);
        if (counter == 3) {
            System.out.println("Three odd numbers entered!");
        }
    }
}

class AnotherClass {
    private int value;

    public AnotherClass(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value is: " + this.value);
    }

    public void doNothing() {
        // This method intentionally left blank
    }
}

