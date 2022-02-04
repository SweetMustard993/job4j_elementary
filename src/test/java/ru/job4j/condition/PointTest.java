package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to79then6d7() {
        double expected = 6.7;
        Point point1 = new Point(4, 3);
        Point point2 = new Point(7, 9);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0.0;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 1);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when61to16then7d07() {
        double expected = 7.07;
        Point point1 = new Point(6, 1);
        Point point2 = new Point(1, 6);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}