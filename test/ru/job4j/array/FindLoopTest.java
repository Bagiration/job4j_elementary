package ru.job4j.array;

//6.1. Классический поиск перебором.
//6.5. Поиск индекса в диапазоне.

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    // тест с положительным итогом.
    // я добавил в методе слово static (компилятор ругался) и сделал код теста по своему. Пока не понимаю колдовство со словом new
    @Test
    public void whenArrayHas7Then3() {
        int[] input = new int[]{4, 8, 10, 7};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    // тест с отрицательным итогом.
    // я добавил в методе слово static и сделал код теста по своему. Пока не понимаю колдовство со словом new
    @Test
    public void whenArrayDontFind() {
        int[] input = new int[]{4, 8, 10, 7};
        int value = 18;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayDontFound7() {
        int[] input = {5, 15, 25, 35, 45, 7};
        int value = 7;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}

