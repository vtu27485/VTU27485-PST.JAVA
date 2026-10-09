import java.util.*;

abstract class Vehicle {
    String vehicle;

    Vehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}

class Auto extends Vehicle {
    Auto() {
        super("Auto");
    }
}

class Bike extends Vehicle {
    Bike() {
        super("Bike");
    }
}

class Driver {
    double distance;

    Driver(double distance) throws Exception {
        if (distance < 0) {
            throw new Exception("Invalid distance");
        }
        this.distance = distance;
    }

    double getFare() {
        return distance * 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                Driver driver = new Driver(distance);
                System.out.println(driver.getFare());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

/*
Sample Input:
3
bike 10
car 15
auto 20

Sample Output:
100.0
150.0
200.0
*/
