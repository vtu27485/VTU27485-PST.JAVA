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

        int val = sc.nextInt();

        int[] ans = Arrays.stream(nums)
                          .filter(x -> x != val)
                          .toArray();

        System.out.println(ans.length);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}

/*
Input:
4
3 2 2 3
3

Output:
2
[2, 2]
*/
