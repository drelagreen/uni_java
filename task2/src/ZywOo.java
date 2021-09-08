import java.util.ArrayList;

public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                list.add(array[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
