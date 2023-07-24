package ru.job4j.function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Comparator<String> cmpText = Comparator.naturalOrder();
        List<String> list = new ArrayList<>();
        list.add("sdsfsg");
        list.add("sdsfsg");
        list.add("sdsfscfs");
        list.add("ssdsfsg");
        list.sort(cmpText);
        System.out.println(list);
    }
}
