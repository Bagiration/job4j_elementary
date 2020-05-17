package ru.job4j.loop;

//5.2. Создать программу, вычисляющую факториал. [#285352]

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 120;
        int in = Factorial.calc(5);
        assertThat(in, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 1;
        int in = Factorial.calc(0);
        assertThat(in, is(expected));
    }
}