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

        int[] ans = Arrays.stream(nums)
                          .distinct()
                          .toArray();

        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}

/*
Input:
6
1 1 2 2 3 4

Output:
[1, 2, 3, 4]
*/
