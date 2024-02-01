package lsn.io.app;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        int[] elements = Arrays.stream(inputLine.split(" ")).
                mapToInt(Integer::parseInt).toArray();

        calculate(elements);
    }

    static List<String> calculate(int[] elements) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] + elements[j] == 13 && elements[i] >= elements[j]) {
                    addWithSort(results, elements[i], elements[j]);
                }
            }
        }
        show(results);
        return results;
    }

    static void addWithSort(List<String> resultPairs, int first, int second) {
        if (first < second) {
            resultPairs.add(first + " " + second);
        } else {
            resultPairs.add(second + " " + first);
        }
    }

    static void show(List<String> results) {
        results.sort(Comparator.naturalOrder());
        results.forEach(System.out::println);
    }
}
