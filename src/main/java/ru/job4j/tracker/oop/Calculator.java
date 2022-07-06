package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return a * x;
    }

    public static  int minus(int b) {
        return b - x;
    }

    public  int divide(int c) {
        return  c / x;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.divide(1));
        System.out.println(sum(5));
        System.out.println(minus(5));
    }
}
