package ru.job4j.array;

//6.1. Классический поиск перебором.

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    // тест с положительным итогом.
    // я добавил в методе слово static (компилятор ругался) и сделал код теста по своему. Пока не понимаю колдовство со словом new
    @Test
    public void whenArrayHas7Then3() {
        int[] input = new int[] {4, 8, 10, 7};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat (result, is (expect));
    }

    // тест с отрицательным итогом.
    // я добавил в методе слово static и сделал код теста по своему. Пока не понимаю колдовство со словом new
    @Test
    public void whenArrayHasDontFind() {
        int[] input = new int[] {4, 8, 10, 7};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat (result, is (expect));
    }
   }