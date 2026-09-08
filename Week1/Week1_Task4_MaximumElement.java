package Week_Tasks.Week1_Tasks;

import java.util.Scanner;

public class Week1_Task4_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);

        sc.close();
    }
}

/*
Sample Input:
5
25 10 45 30 20

Sample Output:
Enter number of elements: 5
Enter 5 elements:
Maximum element is: 45
*/
