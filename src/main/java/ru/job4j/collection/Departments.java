package ru.job4j.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = value.substring(0, 2);
            for (String el : value.split("/")) {
                if (value.substring(0, 2).equals(el)) {
                    tmp.add(start);
                } else {
                    tmp.add(start = start + "/" + el);
                }
            }
        } return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}