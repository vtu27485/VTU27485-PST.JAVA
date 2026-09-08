import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int current = a[0];
        int best = a[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(a[i], current + a[i]);
            best = Math.max(best, current);
        }

        System.out.println(best);
    }
}

/*
Input:
9
-2 1 -3 4 -1 2 1 -5 4

Output:
6
*/
