import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, customerName, balance);
        accounts.add(account);

        System.out.println("Account created successfully!");
    }

    public void deposit() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();

                account.deposit(amount);
                return;
            }
        }

        System.out.println("Account not found!");
    }

    public void withdraw() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();

                account.withdraw(amount);
                return;
            }
        }

        System.out.println("Account not found!");
    }

    public void checkBalance() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                System.out.println("Current Balance: ₹" + account.getBalance());
                return;
            }
        }

        System.out.println("Account not found!");
    }

    public void displayAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No accounts available.");
            return;
        }

        for (BankAccount account : accounts) {

            System.out.println("----------------------------");
            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Customer Name  : " + account.getCustomerName());
            System.out.println("Balance        : ₹" + account.getBalance());
        }
    }
}
