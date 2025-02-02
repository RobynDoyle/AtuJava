package week7;

public class BankAccountTester {

    public static void main(String[] args){

        BankAccount BankAccount = new BankAccount();

        BankAccount.setAccountName("Tom Murphy");
        
        System.out.println("Balance is: " + BankAccount.getBalance());
        BankAccount.deposit(10);
        System.out.println("Balance after deposti is: " + BankAccount.getBalance());
        BankAccount.withdraw(50);
        System.out.println("Balance after withdrawl is: " + BankAccount.getBalance());



    }
    
}
