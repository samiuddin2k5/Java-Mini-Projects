import java.util.Scanner;

public class ATM {
    private static double balance = 1000.00; // initial balance
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java ATM Machine!");

        // Login
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != PIN) {
            System.out.println(" Invalid PIN. Access Denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n======= ATM MENU =======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println(" Thank you for using the ATM!");
                    break;
                default:
                    System.out.println(" Invalid option. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }

    public static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" Withdrawal successful.");
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }
}
