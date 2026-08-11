import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = Arrays.stream(nums).reduce(Integer.MIN_VALUE,
                (maxEnding, x) -> {
                    if (maxEnding < 0)
                        maxEnding = x;
                    else
                        maxEnding += x;
                    return maxEnding;
                });

        int currentSum = 0;
        int answer = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            answer = Math.max(answer, currentSum);
        }

        System.out.println(answer);

        sc.close();
    }
}

/*
Input:
9
-2 1 -3 4 -1 2 1 -5 4

Output:
6
*/
