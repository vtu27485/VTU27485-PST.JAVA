
public class week9_task6_Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Division by zero");

        return a / b;
    }

    public static void main(String[] args) {
        week9_task6_Calculator calc = new week9_task6_Calculator();

        System.out.println(calc.add(10, 5));

        try {
            System.out.println(calc.divide(10, 2));
            System.out.println(calc.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
Sample Input:
10 5
10 2
10 0

Sample Output:
15
5
Exception caught: Division by zero
*/
