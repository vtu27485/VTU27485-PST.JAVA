import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int total = a[0];

        int maxEnding = a[0];
        int maxSum = a[0];

        int minEnding = a[0];
        int minSum = a[0];

        for (int i = 1; i < n; i++) {
            total += a[i];

            maxEnding = Math.max(a[i], maxEnding + a[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(a[i], minEnding + a[i]);
            minSum = Math.min(minSum, minEnding);
        }

        if (maxSum < 0)
            System.out.println(maxSum);
        else
            System.out.println(Math.max(maxSum, total - minSum));
    }
}

/*
Input:
5
1 -2 3 -2 5

Output:
7
*/
