package ru.job4j.tracker.oop;

public class Ball {
    public  void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball eaten");
        } else {
            System.out.println("Ball escaped");
        }
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
