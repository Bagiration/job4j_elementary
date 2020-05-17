package ru.job4j.loop;

//5.1. Подсчет суммы чётных чисел в диапазоне [#285351]

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int expected = 18;
        int out = Counter.sumByEven(3, 8);
        Assert.assertEquals(expected, out);
    }

    // or

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirtyAlternative() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}