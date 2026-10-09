import java.util.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(
                "Cannot divide by zero");
        }

        return (double) a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        Calculator c = new Calculator();

        double actual;
        double expected;

        if (op.equals("+")) {
            actual = c.add(a, b);
            expected = a + b;
        } else {
            actual = c.divide(a, b);
            expected = (double) a / b;
        }

        if (actual == expected) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}

/*
Sample Input:
10 4 +

Sample Output:
Test passed
*/
