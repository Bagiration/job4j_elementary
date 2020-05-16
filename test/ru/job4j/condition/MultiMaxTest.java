package ru.job4j.condition;

//4.4. Максимум из трех чисел [#285263]

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
       MultiMax check = new MultiMax();
        int result = check.max(40, 4, 2);
        //  int result = MultiMax.max(40, 4, 2);
        assertThat(result, is(40));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 40, 2);
        assertThat(result, is(40));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 50);
        assertThat(result, is(50));
    }

    @Test
    public void whenTheSameMax() {
        int result = MultiMax.max(10, 10, 10);
        assertThat(result, is(10));
    }
}