package Week_Tasks.Week1_Tasks;

import java.util.Scanner;

public class Week1_Task6_ArrayPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All possible pairs:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }

        sc.close();
    }
}

/*
Sample Input:
4
10 20 30 40

Sample Output:
Enter number of elements: 4
Enter 4 elements:
All possible pairs:
(10, 20)
(10, 30)
(10, 40)
(20, 30)
(20, 40)
(30, 40)
*/
