import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class newprogram {
    private static Map<String, User> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        // Simulated user database
        userDatabase.put("user1", new User("user1", "password1"));
        userDatabase.put("user2", new User("user2", "password2"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        User user = userDatabase.get(username);

        if (user != null) {
            // In a real application, you would send an email with a password reset link/token
            System.out.println("An email with a password reset link has been sent to your email address.");
        } else {
            System.out.println("User not found. Please check the username.");
        }
        scanner.close();
    }
}