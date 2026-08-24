import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        int sign = 1;

        if (i < s.length() &&
            (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-')
                sign = -1;

            i++;
        }

        long result = 0;

        while (i < s.length() &&
               Character.isDigit(s.charAt(i))) {

            result = result * 10 + (s.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
                break;
            }

            if (sign == -1 && -result < Integer.MIN_VALUE) {
                result = (long) Integer.MAX_VALUE + 1;
                break;
            }

            i++;
        }

        result *= sign;

        result = Math.max(Integer.MIN_VALUE,
                Math.min(Integer.MAX_VALUE, result));

        System.out.println(result);
    }
}

/*
Input:
   -42

Output:
-42
*/
