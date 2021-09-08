import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        Object[] objects = Arrays.stream(numbers).boxed().toArray();
        return String.format(
                "(%d%d%d) %d%d%d-%d%d%d%d",
                objects
        );
    }
}
