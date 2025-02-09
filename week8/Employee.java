package week8;

public class Employee {

    // instant vars
    private int employeeNumber;
    private String name;
    private String jobTitle;
    private double salary;

    // constructor
    public Employee(){
        employeeNumber = 0;
        name = "";
        jobTitle = "";
        salary = 0.0;  
    }

    public Employee(int num, String nameIn, double salaryIn){
        employeeNumber = num;
        name = nameIn;
        jobTitle = "";
        salary = salaryIn;  
    }

    public Employee(int num, String nameIn, double salaryIn, String title){
        employeeNumber = num;
        name = nameIn;
        jobTitle =title;
        salary = salaryIn;  
    }

    // methods

    //get vars

    public int getEmployeeNumber(){
        return employeeNumber;
    }

    public double getSalary(){
        return salary;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public String getName(){
        return name;
    }

    public void raiseSalary(int amount){
        salary = salary + amount;
    }
    
    public void reduceSalary(int amountLess){
        salary = salary - amountLess;
    }

    public double calcMonthWage(){
        return salary / 12;
    }

    public double calcBonus(){
        double bonus = salary * .3;
        return bonus;
    }

    public String getAllInfo(){
        String allInfo = "Salary is: " + salary + ". Name is " + name + ". Job is " + jobTitle + ". E ID is " + employeeNumber;
        return allInfo;
    }


}
