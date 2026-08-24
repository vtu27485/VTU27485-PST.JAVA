import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++)
            s[i] = sc.nextInt();

        int d = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += s[i];

            if (i >= m)
                sum -= s[i - m];

            if (i >= m - 1 && sum == d)
                count++;
        }

        System.out.println(count);
    }
}

/*
Input:
5
1 2 1 3 2
3 2

Output:
2
*/
