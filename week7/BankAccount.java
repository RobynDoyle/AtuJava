package week7;

public class BankAccount {

    private double balance;
    private String accountName;


    // constructor
    public BankAccount(){
        balance = 0.0;
        accountName = "";

    }

    public void setAccountName(String n){
        accountName = n;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double deposit){
        balance = balance + deposit;
    }

    public void withdraw(double w){
        balance = balance - w;
    }
}
