package ru.job4j.array;

//6.2.2. Переставить элементы массива

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {1, 2, 7, 4, 5, 6, 3, 8};
        int[] rsl = SwitchArray.swap(input, 2, 6);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {1, 6, 3, 4, 5, 2, 7, 8};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 3);
        assertThat(rsl, is(expect));
    }

}