package ru.job4j.condition;
//4.5. Отладка программы в IDEA [#285257]
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProbSqAreaTest {

    @Test
    public void whenp4k1s1() {
        int k = 1;
        int p = 4;
        int expected = 1;
        int s = ProbSqArea.square(p, k);
        assertThat(s, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        int expected = 2;
        int s = ProbSqArea.square(p, k);
        assertThat(s, is(expected));
    }
}