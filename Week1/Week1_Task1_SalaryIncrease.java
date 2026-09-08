package Week_Tasks.Week1_Tasks;

import java.util.Scanner;

public class Week1_Task1_SalaryIncrease {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] salary = new int[n];

        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        System.out.println("Updated Salaries:");

        for (int i = 0; i < n; i++) {
            salary[i] = salary[i] + (salary[i] * 10 / 100);
            System.out.print(salary[i] + " ");
        }

        sc.close();
    }
}

/*
Sample Input:
5
10000 20000 30000 40000 50000

Sample Output:
Updated Salaries:
11000 22000 33000 44000 55000
*/
