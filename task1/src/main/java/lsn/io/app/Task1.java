package lsn.io.app;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStream = scanner.nextLine();
        String[] numbersAsStrings = inputStream.split(" ");

        int[] values = convertToIntValues(numbersAsStrings);

        int[] distinctArr = getDistinctArr(values);
        Arrays.sort(distinctArr);

        showResults(distinctArr, values);
    }

    static int[] convertToIntValues(String[] numbersAsStrings) {
        return Arrays.stream(numbersAsStrings).
                mapToInt(Integer::parseInt).toArray();
    }

    static void showResults(int[] distinctArr, int[] values) {
        show(Arrays.toString(distinctArr).replaceAll("[\\[\\],]", ""));
        show("count: ", values.length);
        show("distinct: ", distinctArr.length);
        show("min: ", values[0]);
        show("max: ", distinctArr[distinctArr.length - 1]);
    }

    static int[] getDistinctArr(int[] values) {
        return Arrays.stream(values).distinct().toArray();
    }

    private static void show(String s) {
        System.out.println(s);
    }

    static void show(String key, int value) {
        System.out.println(key + value);
    }
}
