import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.next();
            map.put(tag, map.getOrDefault(tag, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

/*
Sample Input:
5
java
coding
java
programming
java

Sample Output (order may vary):
java 3
coding 1
programming 1
*/
