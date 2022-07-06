package ru.job4j.tracker.oop;

public class DummyDic {
    public  String engToRus(String eng) {
        return "неизвестное слово" + eng;
    }

    public static void main(String[] args) {
        DummyDic dc = new DummyDic();
        System.out.println(dc.engToRus("embrace"));
    }
}
