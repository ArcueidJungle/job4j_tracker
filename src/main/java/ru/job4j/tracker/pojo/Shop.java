package ru.job4j.tracker.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int j = -1;
        for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    return i;
                }
        } return -1;
    }
}