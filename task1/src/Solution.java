public class Solution {
    public static String rangeExtraction(int[] arr) {
        int beginRange = arr[0];
        int previousNumber = arr[0];
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= arr.length; i++) {
            if (i==arr.length || arr[i] - 1 != previousNumber) {

                if (previousNumber - beginRange >= 2) {
                    output.append(beginRange).append('-').append(previousNumber);
                } else if (beginRange + 1 == previousNumber) {
                    output.append(beginRange).append(',').append(previousNumber);
                } else {
                    output.append(beginRange);
                }

                if (i!=arr.length) {
                    output.append(',');
                    beginRange = arr[i];
                } else {
                    break;
                }
            }
            previousNumber = arr[i];
        }
        return output.toString();
    }

    //Using only for testing
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        System.out.println(rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }
}
