import java.util.Arrays;
import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStream = scanner.nextLine();

        String[] numbersAsStrings = inputStream.split(" ");
        int[] values = Arrays.stream(numbersAsStrings).
                mapToInt(Integer::parseInt).toArray();

        int[] distinctArr = Arrays.stream(values).distinct().toArray();

        Arrays.sort(distinctArr);

        System.out.println(Arrays.toString(distinctArr)
                .replaceAll("[\\[\\],]", ""));

        show("count: ", values.length);
        show("distinct: ", distinctArr.length);
        show("min: ", values[0]);
        show("max: ", distinctArr[distinctArr.length - 1]);
    }

    static void show(String key, int value) {
        System.out.println(key + value);
    }
}
