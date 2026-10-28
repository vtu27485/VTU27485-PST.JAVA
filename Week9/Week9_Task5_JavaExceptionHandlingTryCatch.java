
package Week_Tasks.Week9_Tasks;

import java.util.*;

public class Week9_Task5_JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(x / y);

            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Exception caught: " + e);
                sc.next();
            }
        }
    }
}

/*
Sample Input:
10 2
8 0
abc 5
20 4

Sample Output:
5
Exception caught: / by zero
Exception caught: java.util.InputMismatchException
5
*/
