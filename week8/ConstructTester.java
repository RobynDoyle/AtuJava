package week8;

public class ConstructTester {

    public static void main(String[] args){

        Construct account = new Construct(55);
        int k = account.getAccount();
        System.out.println("account nu is " + k);

        Construct account2 = new Construct(65, "Bobs");

        System.out.println("Account owned by " + account2.getAccountName() + " value is " + account2.getAccount());


    }
    
}
