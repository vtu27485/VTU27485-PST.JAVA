import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Double> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            readings.add(sc.nextDouble());
        }

        double threshold = 50;

        double average = readings.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);

        System.out.println("Average: " + average);

        readings.stream()
                .filter(x -> x > threshold)
                .forEach(x -> System.out.println(x));
    }
}

/*
Sample Input:
6
50 60 70 80 90 100

Sample Output:
Average: 75.0
60.0
70.0
80.0
90.0
100.0
*/
