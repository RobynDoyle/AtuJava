package java2.week1;

public class Employee {


    private static int counter = 0;
    private int ID = 0;
    private String name;
    private double salary;

    // constructors

    public Employee(){
        counter++;
        ID = counter;
        name = "";
        salary = 0;

    }
    
    public Employee(int IDIn, String nameIn, double salaryIn){ 
        ID = IDIn;
        name = nameIn;
        salary = salaryIn;
    }

    public double getSalary(){
        return salary;
    }
}
