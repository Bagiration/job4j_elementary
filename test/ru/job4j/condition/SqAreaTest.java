package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;


public class SqAreaTest {

   @Test
    public void controlArea() {
        int inp = 6;
        int ink = 2;
        int expected = 2;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
}