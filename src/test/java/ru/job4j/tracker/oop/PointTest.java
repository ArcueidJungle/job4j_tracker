package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.sqrt;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then2() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to20then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to13then2() {
        double expected = 2;
        Point a = new Point(1, 1);
        Point b = new Point(1, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to131then2() {
        double expected = 2;
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 3, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when121to114then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 2, 1);
        Point b = new Point(1, 1, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}