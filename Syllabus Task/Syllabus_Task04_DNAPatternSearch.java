import java.util.*;

public class Main {
    static void computeLPS(String p, int[] lps) {
        int len = 0;
        lps[0] = 0;

        for (int i = 1; i < p.length();) {
            if (p.charAt(i) == p.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String pattern = sc.next();

        int[] lps = new int[pattern.length()];
        computeLPS(pattern, lps);

        int i = 0, j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < text.length()
                    && text.charAt(i) != pattern.charAt(j)) {
                if (j > 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
    }
}

/*
Sample Input:
AAGAAACCA
AA

Sample Output:
0 1 3 4
*/
