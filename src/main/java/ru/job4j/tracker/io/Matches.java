package ru.job4j.tracker.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.print(player + ", введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                count -= matches;
                System.out.println(player + " забрал " + matches + " спичек. Всего осталось " + count);
                turn = !turn;
            } else {
                System.out.println("Ошибка ввода. Попробуйте ввести ещё раз.");
            }
        }
        System.out.println("Победил " + (!turn ? "Первый игрок." : "Второй игрок."));
    }
}