import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {

            deque.add(arr[i]);

            if (deque.size() > m) {
                deque.poll();
            }

            if (deque.size() == m) {
                set.clear();
                for (int num : deque) {
                    set.add(num);
                }
                max = Math.max(max, set.size());
            }
        }

        System.out.println(max);

        sc.close();
    }
}

/*
Input:
6 3
5 3 5 2 3 2

Output:
3
*/
