import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("💱 Welcome to Currency Converter!");
        System.out.println("Supported Currencies: PKR, USD, EUR, GBP");

        System.out.print("Enter source currency (e.g., PKR): ");
        String from = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., USD): ");
        String to = scanner.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(from, to, amount);

        if (convertedAmount == -1) {
            System.out.println("❌ Invalid currency input.");
        } else {
            System.out.printf("✅ %.2f %s = %.2f %s\n", amount, from, convertedAmount, to);
        }

        scanner.close();
    }

    public static double convertCurrency(String from, String to, double amount) {
        // Exchange rates relative to 1 PKR
        double PKR_TO_USD = 0.0036;
        double PKR_TO_EUR = 0.0033;
        double PKR_TO_GBP = 0.0028;

        double PKR;

        // Convert 'from' currency to PKR first
        switch (from) {
            case "PKR":
                PKR = amount;
                break;
            case "USD":
                PKR = amount / PKR_TO_USD;
                break;
            case "EUR":
                PKR = amount / PKR_TO_EUR;
                break;
            case "GBP":
                PKR = amount / PKR_TO_GBP;
                break;
            default:
                return -1; // Invalid currency
        }

        // Now convert PKR to 'to' currency
        switch (to) {
            case "PKR":
                return PKR;
            case "USD":
                return PKR * PKR_TO_USD;
            case "EUR":
                return PKR * PKR_TO_EUR;
            case "GBP":
                return PKR * PKR_TO_GBP;
            default:
                return -1; // Invalid currency
        }
    }
}
