package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("working?" + active);
        System.out.println("10" + status);
        System.out.println("Vse ochen ploho" + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 4, " sad");
        error.printInfo();
    }
}
