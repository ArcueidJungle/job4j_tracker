package ru.job4j.tracker.oop;

public class Max {
    public int max(int first, int second) {
        return Math.max(first, second);
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(max(first, fourth), max(second, third));
    }
}
