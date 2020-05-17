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
}