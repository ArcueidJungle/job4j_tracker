package ru.job4j.tracker.oop;

public class Jukebox {
    public  void  music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("ничего не найдено");
        }
    }

    public static void main(String[] args) {
        Jukebox skat = new Jukebox();
        skat.music(1);
        skat.music(2);
        skat.music(3);
    }
}
