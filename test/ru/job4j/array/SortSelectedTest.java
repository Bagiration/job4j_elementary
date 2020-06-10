package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//6.5.3. Сортировка выборкой

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortWith3() {
        int[] input = {10, 40, 3, 3, 30};
        int[] result = SortSelected.sort(input);
        int[] expect = {3, 3, 10, 30, 40};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortWith5() {
        int[] input = {5, 5, -15, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = {-15, 4, 5, 5};
        assertThat(result, is(expect));
    }
}