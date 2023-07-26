package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] str1 = o1.split("/", 2);
        String[] str2 = o2.split("/", 2);
            if ((str2[0].compareTo(str1[0])) != 0) {
                return (str2[0].compareTo(str1[0]));
            }
            return o1.compareTo(o2);
        }
    }