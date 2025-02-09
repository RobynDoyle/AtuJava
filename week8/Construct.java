package week8;

public class Construct {

    //instace vars
    private int accNum;
    private String accName;

    public Construct(int num){
        accNum = num;
        balance = 0.0;

    }

    public Construct(int num, String name){
        accNum = num;
        accName = name;
    }

    public int getAccount(){

        return accNum; 
    }

    public String getAccountName(){
        return accName;
    }
    
}
