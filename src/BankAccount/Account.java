package BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private List<String> TransactionHistory;

    public Account(){
        this(0,0,null,null);
    }

    public Account(double balance, int accountNumber, String accountHolderName, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        TransactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }



    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public List<String> getTransactionHistory() {
        return TransactionHistory;
    }

    public void deposit(double amount){
        this.balance += amount;
        TransactionHistory.add("Deposit of amount :"+amount);
    }
    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient Funds!!");
            return;
        }
        this.balance -= amount;
        TransactionHistory.add("Withdraw of amount :"+amount);
    }

}
