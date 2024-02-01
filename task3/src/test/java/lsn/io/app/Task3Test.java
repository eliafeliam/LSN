package lsn.io.app;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void testGetCountOfGraphsTwo() {
        List<Integer> vertices = List.of(4,3,1,4,5,6);
        int result = Task3.getCountOfGraphs(vertices);

        assertEquals(2, result);
    }

    @Test
    public void testGetCountOfGraphOne() {
        List<Integer> vertices = List.of(1,2,2,3,3,4);
        int result = Task3.getCountOfGraphs(vertices);

        assertEquals(1, result);
    }

    @Test
    public void testTryAddToExistingGraphTrue() {
        int vertex1 = 1;
        int vertex2 = 2;
        int countOfGraphs = 1;

        Map<Integer, Set<Integer>> graphsMap = new HashMap<>();
        Task3.putNewSetWithDefInit(graphsMap, countOfGraphs, vertex1, vertex2);

        boolean addedToExistingGraph = Task3.tryAddToExistingGraph(graphsMap, vertex1+1, vertex2+1);

        assertTrue(addedToExistingGraph);
    }

    @Test
    public void testTryAddToExistingGraphFalse() {
        int vertex1 = 1;
        int vertex2 = 2;
        int countOfGraphs = 1;

        Map<Integer, Set<Integer>> graphsMap = new HashMap<>();
        Task3.putNewSetWithDefInit(graphsMap, countOfGraphs, vertex1, vertex2);

        boolean addedToExistingGraph = Task3.tryAddToExistingGraph(graphsMap, vertex1+2, vertex2+1);

        assertFalse(addedToExistingGraph);
    }

    @Test
    public void testPutNewSetWithDefInit() {
        int countOfGraphs = 1;
        int vertex1 = 1;
        int vertex2 = 2;

        Map<Integer, Set<Integer>> graphsMap = new HashMap<>();

        Task3.putNewSetWithDefInit(graphsMap, countOfGraphs, vertex1, vertex2);

        // Assert the result
        assertEquals(1, graphsMap.size());
        assertArrayEquals(new int[]{vertex1, vertex2}, graphsMap.get(countOfGraphs).stream().
                mapToInt(Number::intValue).
                toArray());
    }
}