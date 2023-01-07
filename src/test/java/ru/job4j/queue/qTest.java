package ru.job4j.queue;

import java.util.Deque;
import java.util.LinkedList;

public class qTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.add(4);
        int a = deque.removeFirst();
        System.out.println(a);

    }
}
