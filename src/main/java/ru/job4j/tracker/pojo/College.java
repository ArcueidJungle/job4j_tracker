package ru.job4j.tracker.pojo;

public class College {
    public static void main(String[] args) {
        Student petrov = new Student();
        petrov.setFIO("Petrov Petr Petrovich");
        petrov.setDate("01.08.3000");
        petrov.setGroup(1042);
        System.out.println(petrov.getFIO() + " " + petrov.getGroup() + " " + petrov.getDate());
    }
}
