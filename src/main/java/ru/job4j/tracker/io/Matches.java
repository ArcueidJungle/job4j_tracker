package ru.job4j.tracker.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("���� 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "������ �����" : "������ �����";
            System.out.print(player + ", ������� ����� �� 1 �� 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                count -= matches;
                System.out.println(player + " ������ " + matches + " ������. ����� �������� " + count);
                turn = !turn;
            } else {
                System.out.println("������ �����. ���������� ������ ��� ���.");
            }
        }
        System.out.println("������� " + (!turn ? "������ �����." : "������ �����."));
    }
}