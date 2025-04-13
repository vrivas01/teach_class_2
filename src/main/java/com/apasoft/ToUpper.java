package com.apasoft;

public class ToUpper {
    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            String output = input.toUpperCase();
            System.out.println(output);
        } else {
            System.out.println("No input provided!");
        }
    }

    // Method to convert text to uppercase (used in unit testing)
    public static String convertToUpper(String input) {
        return input.toUpperCase();
    }
}
