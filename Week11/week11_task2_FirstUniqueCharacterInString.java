
import java.util.*;

public class week11_task2_FirstUniqueCharacterInString {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.hasNext() ? sc.next() : "leetcode";

        System.out.println(firstUniqChar(s));
        sc.close();
    }
}

/*
Sample Input:
leetcode

Sample Output:
0

Another Sample Input:
loveleetcode

Another Sample Output:
2

Another Sample Input:
aabb

Another Sample Output:
-1
*/
