class BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited ₹" + amount + " to " + accountHolderName + "'s account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountHolderName + "'s account.");
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Balance: ₹" + accountBalance);
        System.out.println("--------------------------------------");
    }

 
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Shivam", "ICICI", 10000.0);
        BankAccount acc2 = new BankAccount("Aarav", "HDFC", 15000.0);
        BankAccount acc3 = new BankAccount("Ayush", "SBI", 12000.0);

        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.displayAccountDetails();

        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.displayAccountDetails();

        acc3.deposit(1000);
        acc3.withdraw(1500);
        acc3.displayAccountDetails();
    }
}
