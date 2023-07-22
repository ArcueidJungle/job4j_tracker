package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
        public int compare(String left, String right) {
                String[] partsLeft = left.split("\\D+", 2);
                String[] partsRight = right.split("\\D+", 2);
                return Integer.compare(Integer.parseInt(partsLeft[0]), Integer.parseInt(partsRight[0]));
            }
        }