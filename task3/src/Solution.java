public class Solution {
    public static String makeAWindow(int num) {
        int l = num * 2 + 3;
        char[][] window = new char[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || i == l - 1 || i == (l - 1) / 2) {
                    window[i][j] = '-';
                } else if (j == 0 || j == l - 1 || j == (l - 1) / 2) {
                    window[i][j] = '|';
                } else {
                    window[i][j] = '.';
                }
            }
            window[(l - 1) / 2][0] = '|';
            window[(l - 1) / 2][l - 1] = '|';
            window[(l - 1) / 2][(l - 1) / 2] = '+';
        }
        StringBuilder builder = new StringBuilder(l * l);
        for (char[] chars : window) {
            for (char c : chars) {
                builder.append(c);
            }
            builder.append('\n');
        }
        return builder.deleteCharAt(builder.length() - 1).toString();
    }

    //Using only for testing
    public static void main(String[] args) {
        System.out.println(makeAWindow(1));
        System.out.println(makeAWindow(2));
        System.out.println(makeAWindow(5));
    }

}
