package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book alex = new Book("Vtoroy", 21);
        Book petr = new Book("1", 12);
        Book sanya = new Book("Pushkin", 1);
        Book cleanCode = new Book("Clean code", 2);
        Book[] bok = new Book[4];
        bok[0] = alex;
        bok[1] = petr;
        bok[2] = sanya;
        bok[3] = cleanCode;
        System.out.println("Книги в библиотеке:");
        for (Book book : bok) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        Book bk = bok[0];
        bok[0] = bok[3];
        bok[3] = bk;
        System.out.println("Книги в библиотеке:");
        for (Book book : bok) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        System.out.println("Clean code books");
        for (Book book : bok) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " " + book.getCount());
            }
        }
    }
}
