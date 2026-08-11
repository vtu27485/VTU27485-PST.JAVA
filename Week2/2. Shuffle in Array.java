import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = IntStream.range(0, n)
                .flatMap(i -> IntStream.of(nums[i], nums[i + n]))
                .toArray();

        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}

/*
Input:
3
2 5 1 3 4 7

Output:
[2, 3, 5, 4, 1, 7]
*/
