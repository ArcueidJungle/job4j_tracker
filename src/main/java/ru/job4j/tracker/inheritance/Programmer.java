package ru.job4j.tracker.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(int expirience, boolean degree, String programLang) {
        super(expirience, degree);
        this.programLang = programLang;
    }
}
