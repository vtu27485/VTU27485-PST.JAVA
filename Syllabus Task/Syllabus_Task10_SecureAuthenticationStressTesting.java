import java.util.*;

class AuthSystem {
    private String username;
    private String password;

    AuthSystem(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        if (username.length() < 3 ||
            username.length() > 20) {
            return false;
        }

        if (password.length() < 6 ||
            password.length() > 20) {
            return false;
        }

        return username.equals(this.username)
                && password.equals(this.password);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AuthSystem auth =
                new AuthSystem("admin", "admin123");

        int n = sc.nextInt();

        while (n-- > 0) {
            String username = sc.next();
            String password = sc.next();

            try {
                if (auth.login(username, password)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILURE");
                }
            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        }
    }
}

/*
Sample Input:
3
admin admin123
user pass
admin admin123

Sample Output:
SUCCESS
FAILURE
SUCCESS
*/
