package dev.paolofilippelli;

import java.util.*;
import java.text.*;

public class AnotherSmellyClass {
    private List<String> dataList = new ArrayList<String>();
    private int count = 0;
    private String message = "Default Message";

    public static void main(String[] args) {
        AnotherSmellyClass instance = new AnotherSmellyClass();
        instance.readInput();
        instance.printDate();
        instance.unusedMethod();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.length() > 5) {
                dataList.add(input.toUpperCase());
            } else {
                dataList.add(input.toLowerCase());
            }
            count++;
            if (count == 3) {
                System.out.println("You've entered three items!");
            }
        }
    }

    public void printDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Current date and time: " + dateFormat.format(date));
    }

    public void unusedMethod() {
        System.out.println("This method is never called");
    }

    public String concatenateStrings(String str1, String str2) {
        String result = str1 + str2;
        System.out.println("Concatenated string: " + result);
        return result;
    }
}

class ExtraClass {
    public void doSomething() {
        System.out.println("Doing something in ExtraClass");
    }

    public void anotherUnusedMethod() {
        // This method intentionally left blank
    }
}

