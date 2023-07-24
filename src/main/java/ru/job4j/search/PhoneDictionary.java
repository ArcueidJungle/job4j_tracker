package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = x -> x.getName().contains(key);
        Predicate<Person> surname = x -> x.getSurname().contains(key);
        Predicate<Person> addres = x -> x.getAddress().contains(key);
        Predicate<Person> phone = x -> x.getPhone().contains(key);
        Predicate<Person> combine = name.or(surname).or(addres).or(phone);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}