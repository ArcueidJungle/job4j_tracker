package ru.job4j.tracker.oop;

public class Cat {
    private String food;
    private String name;

    public String voice() {
        return " myau myau";
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public  void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        System.out.println("there are gav food:");
        gav.show();
    }
}
