package lsn.io.app;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class Task2Test {

    @Test
    public void testCalculate() {
        int[] arr = new int[] {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
        List<String> results = Task2.calculate(arr);

        assertEquals(Arrays.asList("0 13", "3 10", "6 7", "6 7"), results);
    }

    @Test
    public void testAddWithSort() {
        List<String> result = new ArrayList<>();
        Task2.addWithSort(result, 4, 1);

        assertEquals(List.of("1 4"), result);
    }
}