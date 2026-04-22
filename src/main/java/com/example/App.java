package com.example;

public class App {

    // Original method
    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Jenkins CI/CD!";
    }

    // New method → multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // New method → check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Original output
        System.out.println(greet("World"));

        // New outputs
        System.out.println("5 x 3 = " + multiply(5, 3));
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
    }
}
