package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello, Maven!");

        int a = 10;
        int b = 20;

        System.out.println("Sum: " + add(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
