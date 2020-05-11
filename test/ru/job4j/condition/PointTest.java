package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void controlDistance() {
        int inx1 = 1;
        int iny1 = 4;
        int inx2 = 2;
        int iny2 = 0;
        double expected = 4.123;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);


    }
}