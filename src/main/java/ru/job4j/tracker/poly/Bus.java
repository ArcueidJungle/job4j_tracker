package ru.job4j.tracker.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("������� ������");
    }

    @Override
    public void passengers(int count) {
        System.out.println("���������� ����������: " + count);
    }

    @Override
    public double refuel(double value) {
        return value * 1.75;
    }
}
