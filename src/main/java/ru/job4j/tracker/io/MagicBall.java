package ru.job4j.tracker.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        scanner.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("yes");
        } else if (answer == 1) {
            System.out.println("no");
        } else {
            System.out.println("may be");
        }
    }
}
