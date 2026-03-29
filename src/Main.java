public class Main {
    public static void main(String[] args) {

        // Test BankAccount
        System.out.println("=== BankAccount Test ===");
        BankAccount acc1 = new BankAccount("Alice", 100);
        acc1.deposit(50);
        acc1.withdraw(30);
        System.out.println("Balance: " + acc1.getBalance()); // Expected: 120

        // Test SavingsAccount
        System.out.println("\n=== SavingsAccount Test ===");
        SavingsAccount savings = new SavingsAccount("Bob", 200, 0.05);
        savings.applyInterest(); // 5% of 200 = 10
        System.out.println("Balance after interest: " + savings.getBalance()); // Expected: 210

        // Test CheckingAccount
        System.out.println("\n=== CheckingAccount Test ===");
        CheckingAccount checking = new CheckingAccount("Charlie", 100);
        checking.withdraw(20); // 20 + 1.50 fee = 21.50
        System.out.println("Balance after withdrawal: " + checking.getBalance()); // Expected: 78.5

        // Test insufficient funds with fee
        System.out.println("\n=== Insufficient Funds Test ===");
        checking.withdraw(200); // Should NOT withdraw
        System.out.println("Balance remains: " + checking.getBalance()); // Expected: 78.5
    }
}