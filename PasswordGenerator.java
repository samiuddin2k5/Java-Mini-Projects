import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        System.out.println("🔐 Your generated password is: " + password.toString());
        scanner.close();
    }
}
