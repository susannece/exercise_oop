package se.lexicon.susanne;

public class BankAccount {
    private int accountNumber;
    private double balance;
    public Customer customer;

    public BankAccount(int accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public void withdraw(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("Amount must be more than 0.");
        else
            this.balance = this.balance - amount;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;

    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

