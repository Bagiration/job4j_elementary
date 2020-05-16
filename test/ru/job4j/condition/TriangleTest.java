package ru.job4j.condition;
//4.3.1. А существует ли треугольник? [#285265]
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    // Треугольник существует
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }


    // Треугольник не существует
    @Test
    public void whenDontExist() {
        boolean result = Triangle.exist(6.0, 2.0, 3.0);
        assertThat(result, is(false));
    }
}