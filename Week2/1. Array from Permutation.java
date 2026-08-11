import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = IntStream.range(0, nums.length)
                             .map(i -> nums[nums[i]])
                             .toArray();

        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}

/*
Input:
6
0 2 1 5 3 4

Output:
[0, 1, 2, 4, 5, 3]
*/
