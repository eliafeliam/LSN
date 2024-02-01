package lsn.io.app;


import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {
    int[] initTestArr = new int[]{1, 10, 20, 20, 2, 5};

    @Test
    public void testGetDistinctArray() {
        assertArrayEquals(Task1.getDistinctArr(initTestArr), new int[]{1, 10, 20, 2, 5});
    }

    @Test
    public void testConvertToIntValues() {
        String input = "1 10 20 20 2 5";
        assertArrayEquals(initTestArr, Task1.convertToIntValues(input.split(" ")));
    }
}