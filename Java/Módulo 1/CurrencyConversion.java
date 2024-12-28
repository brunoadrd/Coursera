public class CurrencyConversion {
    public static void main(String args[]) {
        double wallet = 100.00;
        double cambioUSDtoEUR = 0.85;
        
        System.out.println("Wallet: USD " + wallet);

        wallet *= cambioUSDtoEUR;

        System.out.println("Wallet: EUR " + wallet);

        wallet -= 55;

        System.out.println("Balance after expenditure: EUR " + wallet);

        wallet /= cambioUSDtoEUR;

        System.out.printf("Wallet: USD %.2f", wallet);
    }
}