import java.util.*;

class Main {

    static int kadane(int[] a) {
        int current = a[0];
        int best = a[0];

        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            best = Math.max(best, current);
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int maxSubarray = kadane(a);

            int sum = 0;
            boolean positive = false;
            int maxElement = a[0];

            for (int x : a) {
                maxElement = Math.max(maxElement, x);

                if (x > 0) {
                    sum += x;
                    positive = true;
                }
            }

            int maxSubsequence = positive ? sum : maxElement;

            System.out.println(maxSubarray + " " + maxSubsequence);
        }
    }
}

/*
Input:
2
4
1 2 3 4
3
-1 -2 -3

Output:
10 10
-1 -1
*/
