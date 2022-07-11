package ru.job4j.tracker.oop;

import ru.job4j.tracker.Tracker;

public class VehicleUsage {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Train train = new Train();
        Bus bus = new Bus();
        Vehicle[] vehicles = new Vehicle[] {airplane, train, bus};
        for (Vehicle veh :vehicles) {
            veh.move();
        }
    }
}
