package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate pre) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (pre.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }
}