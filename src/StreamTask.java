import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return IntStream.of(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x).sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return IntStream.of(numbers)
                .filter(x -> x % 2 != 0)
                .boxed()
                .sorted((a, b) -> Integer.compare(a, b))
                .mapToInt(x -> x.intValue())
                .toArray();
    }

    public static int[] getSortedOddsArrays(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.of(numbers)
                .filter(x -> x % 2 != 0)
                .toArray();
    }
}
