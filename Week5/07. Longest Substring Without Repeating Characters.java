import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] last = new int[256];
        Arrays.fill(last, -1);

        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (last[ch] >= left)
                left = last[ch] + 1;

            last[ch] = right;

            answer = Math.max(answer, right - left + 1);
        }

        System.out.println(answer);
    }
}

/*
Input:
abcabcbb

Output:
3
*/
