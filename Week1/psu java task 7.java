import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String opt = sc.next();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (opt.equalsIgnoreCase("even") && digit % 2 == 0) {
                sum += digit;
            } else if (opt.equalsIgnoreCase("odd") && digit % 2 != 0) {
                sum += digit;
            }

            num /= 10;
        }

        System.out.println(sum);
    }
}
