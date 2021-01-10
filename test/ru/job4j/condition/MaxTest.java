package ru.job4j.condition;
//4.5. Отладка программы в IDEA [#285257]

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }


    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }


    @Test
    public void whenEqual() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To3Then1() {
        int result = Max.max(7, 3, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax1To3Then2() {
        int result = Max.max(1, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenEqualFrom3() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To4Then1() {
        int result = Max.max(7, 3, 5, 4);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax1To4Then2() {
        int result = Max.max(1, 5, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To4Then3() {
        int result = Max.max(1, 2, 3, 0);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenEqualFrom4() {
        int result = Max.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }
}