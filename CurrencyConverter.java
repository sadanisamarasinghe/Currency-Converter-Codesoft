import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Currency Selection
        System.out.println("Currency Converter");
        System.out.print("Enter the base currency code (e.g., USD): ");
        String baseCurrency = scanner.next();

        System.out.print("Enter the target currency code (e.g., EUR): ");
        String targetCurrency = scanner.next();

        // Step 2: Currency Rates (Fetching real-time rates from an API - Replace with
        // actual API calls)
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1.0) {
            System.out.println("Failed to fetch exchange rates. Exiting.");
            System.exit(1);
        }

        // Step 3: Amount Input
        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amountToConvert = scanner.nextDouble();

        // Step 4: Currency Conversion
        double convertedAmount = amountToConvert * exchangeRate;

        // Step 5: Display Result
        System.out.println("\nConversion Result:");
        System.out.println(amountToConvert + " " + baseCurrency + " is equal to " +
                convertedAmount + " " + targetCurrency);

        scanner.close();
    }

    // Simulate fetching exchange rates from an API (Replace this method with actual
    // API calls)
    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        // This is a placeholder. In a real scenario, you would use an API to get the
        // exchange rate.
        // Replace this with actual API calls or use a reliable library for currency
        // conversion.
        // For simplicity, returning a static exchange rate of 1.2.
        return 1.2;
    }
}
