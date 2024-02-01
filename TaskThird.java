import java.util.*;

public class TaskThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLine = Integer.parseInt(scanner.nextLine());
        List<Integer> vertices = new ArrayList<>();

        for (int i = 0; i < numberOfLine; i++) {
            String[] connection = scanner.nextLine().split(" ");
            vertices.add(Integer.parseInt(connection[0]));
            vertices.add(Integer.parseInt(connection[1]));
        }
        System.out.println(getCountOfGraphs(vertices));
    }

    private static int getCountOfGraphs(List<Integer> vertices) {
        Map<Integer, Set<Integer>> graphsMap = new HashMap<>();
        int totalCountOfGraphs = 1;

        putNewSetWithDefInit(graphsMap, totalCountOfGraphs,
                vertices.get(0), vertices.get(1));

        for (int i = 2; i < vertices.size() - 1; i += 2) {
            int vertex1 = vertices.get(i);
            int vertex2 = vertices.get(i + 1);

            if (tryAddToExistingGraph(graphsMap, vertex1, vertex2)) continue;
            ++totalCountOfGraphs;
            putNewSetWithDefInit(graphsMap, totalCountOfGraphs, vertex1, vertex2);
        }
        return totalCountOfGraphs;
    }

    private static boolean tryAddToExistingGraph(Map<Integer, Set<Integer>> graphsMap,
                                                 int vertex1, int vertex2) {
        Optional<Map.Entry<Integer, Set<Integer>>> applicableSet = graphsMap.entrySet().stream().
                filter(set -> set.getValue().stream().anyMatch(x -> x >= vertex1 || x >= vertex2)).findFirst();
        if (applicableSet.isPresent()) {
            applicableSet.get().getValue().add(vertex1);
            applicableSet.get().getValue().add(vertex2);
            return true;
        }
        return false;
    }

    static void putNewSetWithDefInit(Map<Integer, Set<Integer>> graphsValues, int countOfGraphs,
                                     int vertex1, int vertex2) {
        Set<Integer> newSet = new HashSet<>();
        newSet.add(vertex1);
        newSet.add(vertex2);
        graphsValues.put(countOfGraphs, newSet);
    }
}

