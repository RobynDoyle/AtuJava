package week8;

public class EmployeeTester {
    
    public static void main(String[] args){
        Employee emp1 = new Employee();

        System.out.println(emp1.getAllInfo());

        Employee emp2 = new Employee(2020203, "Bob King", 37800.76, "It architect trainee");

        System.out.println(emp2.getAllInfo());

    }
}
