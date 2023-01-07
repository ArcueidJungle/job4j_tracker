package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Leontev@mail.ru", "Леонтьев Иван Иванович");
        map.put("Pusshkin@gmail.ru", "Пушкин     Александр Сергеевич");
        map.put("Lavrentev@mail.ru", "Лаврентеьв Иван Иванович");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
