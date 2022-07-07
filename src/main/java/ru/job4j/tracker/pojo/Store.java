package ru.job4j.tracker.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (Product pr : products) {
            System.out.println(pr.getName() + " " + pr.getCount());
        }
        System.out.println("Replace milk to owl");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (Product pr : products) {
            System.out.println(pr.getName() + " " + pr.getCount());
        }
        System.out.println("Show product only > 10");
        for (Product product : products) {
            if (product.getCount() > 10) {
                System.out.println(product.getName() + " " + product.getCount());
            }
        }
    }
}
