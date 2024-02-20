import java.util.ArrayList;
import java.util.List;
public class Bank {
    List<BankAccount> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.add(account);
        System.out.println("New account created: " + accountNumber);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account " + accountNumber + " not found");
        return null;
    }

}
