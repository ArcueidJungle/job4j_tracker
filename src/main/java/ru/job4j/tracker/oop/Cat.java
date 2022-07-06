package ru.job4j.tracker.oop;

public class Cat {
    public String voice() {
        return " myau myau";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        System.out.println("peppy says" + peppy.voice());
    }
}
