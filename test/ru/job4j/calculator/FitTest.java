package ru.job4j.calculator;


// 2. Тесты для идеальный вес [#285330]

import org.junit.Test;

import org.junit.Assert;
import ru.job4j.converter.Converter;

public class FitTest  {

    @Test
    public void whenHeight170ThenMansWeight80Dot5() {
        double in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);


    }

    @Test
    public void whenHeight160ThenWomansWeights57Dot5() {
        double in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}