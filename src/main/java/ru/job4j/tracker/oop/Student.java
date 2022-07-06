package ru.job4j.tracker.oop;

public class Student {
    public  void music(String lyric) {
        System.out.println("I can sing a song " + lyric);
    }

    public void song() {
        System.out.println("I believe i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "i believe i can fly";
        petya.music(song);
    }
}
