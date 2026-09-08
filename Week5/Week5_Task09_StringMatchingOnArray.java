import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++)
            words[i] = sc.next();

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (i != j && words[j].contains(words[i])) {
                    found = true;
                    break;
                }
            }

            if (found)
                System.out.print(words[i] + " ");
        }
    }
}

/*
Input:
4
mass
as
hero
superman

Output:
as
*/
