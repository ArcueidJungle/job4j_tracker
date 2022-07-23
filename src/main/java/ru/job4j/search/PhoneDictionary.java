package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person o : persons) {
            if (o.getName().contains(key) || o.getPhone().contains(key)
                        || o.getSurname().contains(key) || o.getAddress().contains(key)) {
                result.add(o);
            }
        }
        return result;
    }
}