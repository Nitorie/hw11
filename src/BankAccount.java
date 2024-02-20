public class BankAccount {
    String accountNumber;
    double balance;
    boolean isBlocked;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isBlocked = false;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void deposit(double amount) {
        if (!isBlocked) {
            balance += amount;
            System.out.println(amount + " deposited to account " + accountNumber);
        } else {
            System.out.println("Can not deposit to blocked account " + accountNumber);
        }
    }
    public void withdraw(double amount) {
        if (!isBlocked) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } else {
            System.out.println("Cannot withdraw from blocked account " + accountNumber);
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (!isBlocked && !recipient.isBlocked) {
            if (balance >= amount) {
                balance -= amount;
                recipient.deposit(amount);
                System.out.println(amount + " transferred from account " + accountNumber + " to account " + recipient.getAccountNumber());
            } else {
                System.out.println("Insufficient funds in account " + accountNumber + " for transfer");
            }
        } else {
            System.out.println("Cannot transfer from/to blocked account");
        }
    }

    public void blockAccount() {
        isBlocked = true;
        System.out.println("Account " + accountNumber + " has been blocked");
    }

    public void unblockAccount() {
        isBlocked = false;
        System.out.println("Account " + accountNumber + " has been unblocked");
    }
}
