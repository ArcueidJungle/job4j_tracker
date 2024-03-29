package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AppleStore {

    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String rsl = "";
        for (int i = 0; i < count; i++) {
                rsl = queue.poll().name();
        }
        return rsl;
    }

    public String getLastUpsetCustomer() {
        String rsl = "";
        for (int i = 0; i < count + 1; i++) {
            rsl = queue.poll().name();
        }
        return rsl;
    }
}
