import java.util.*;

class Main {

    static boolean matches(String word, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = pattern.charAt(i);

            if (map1.containsKey(a) && map1.get(a) != b)
                return false;

            if (map2.containsKey(b) && map2.get(b) != a)
                return false;

            map1.put(a, b);
            map2.put(b, a);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++)
            words[i] = sc.next();

        String pattern = sc.next();

        for (String word : words) {
            if (matches(word, pattern))
                System.out.print(word + " ");
        }
    }
}

/*
Input:
6
abc
deq
mee
aqq
dkd
ccc
abb

Output:
mee aqq
*/
