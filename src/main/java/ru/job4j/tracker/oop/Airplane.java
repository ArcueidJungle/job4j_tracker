package ru.job4j.tracker.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("самолет летает по воздуху");
    }
}
