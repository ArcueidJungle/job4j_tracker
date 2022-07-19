package ru.job4j.tracker;

import ru.job4j.tracker.UserAction;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit  programm";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
