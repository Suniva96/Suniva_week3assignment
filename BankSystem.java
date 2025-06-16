class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public void withdraw(double amount) {
        double minBalance = 1000;
        if (getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + minBalance + " must be maintained.");
        }
    }
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest added: " + interest);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("123456", 5000, 5.0);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(2000);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.addInterest();
        System.out.println("Balance after interest: " + acc.getBalance());

        acc.withdraw(1500);
        System.out.println("Balance after valid withdrawal: " + acc.getBalance());

        acc.withdraw(5000);
        System.out.println("Balance after failed withdrawal attempt: " + acc.getBalance());
    }
}
