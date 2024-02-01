package lsn.io.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFirstTest {
    int[] initTestArr = new int[]{1, 10, 20, 20, 2, 5};

    @Test
    public void testGetDistinctArray() {
        Assertions.assertArrayEquals(TaskFirst.getDistinctArr(initTestArr), new int[]{1, 10, 20, 2, 5});
    }

    @Test
    public void testConvertToIntValues() {
        String input = "1 10 20 20 2 5";
        Assertions.assertArrayEquals(initTestArr, TaskFirst.convertToIntValues(input.split(" ")));
    }
}