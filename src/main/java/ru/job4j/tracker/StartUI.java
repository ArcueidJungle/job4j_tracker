package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {

    public  void init(Scanner scanner, Tracker tracker) {
        showMenu();
        boolean run = true;
        while (run) {
            showMenu();
        System.out.println("Select:");
        int select = Integer.parseInt(scanner.nextLine());
        if (select == 0) {
            System.out.println("=== Create a new Item ===");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            Item item = new Item(name);
            tracker.add(item);
        } else if (select == 1) {
            System.out.println("=== Show all items ===");
            Item[] items = tracker.findAll();
            if (items.length > 0) {
                for (Item item : items) {
                    System.out.println(item);
                }
            } else {
                System.out.println("��������� ��� �� �������� ������");
            }
        } else if (select == 2) {
            System.out.println("=== Edit item ===");
            System.out.print("Enter id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            Item item = new Item(name);
            if (tracker.replace(id, item)) {
                System.out.println("������ �������� �������.");
            } else {
                System.out.println("������ ������ ������.");
            }
        } else if (select != 6) {
            System.out.println("������������ ������: " + select);
        } else {
            run = false;
        }
        }
    }

    public void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}