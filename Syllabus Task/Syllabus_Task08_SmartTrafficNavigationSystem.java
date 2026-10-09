import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int src = sc.nextInt();
        int dest = sc.nextInt();

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(src);
        visited[src] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            if (u == dest) {
                System.out.println("YES");
                return;
            }

            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

        System.out.println("NO");
    }
}

/*
Sample Input:
7
5
1 2
1 3
2 4
3 5
4 6
1 6

Sample Output:
YES
*/
