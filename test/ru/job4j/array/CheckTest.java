package ru.job4j.array;

//6.3. Массив заполнен true или false

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenSimilar() {
        boolean[] input = new boolean[]{true, true, true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }
        @Test
        public void whenDontSimilar () {
            boolean[] input = new boolean[]{true, true, true, true, false};
            boolean result = Check.mono(input);
            assertThat(result, is(false));
        }
    }