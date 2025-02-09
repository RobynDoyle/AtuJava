package week8;

import java.util.Scanner;

public class EmployeeTester {
    
    public static void main(String[] args){
        Employee emp1 = new Employee();

        Scanner keyboardIn = new Scanner(System.in);

        System.out.println(emp1.getAllInfo());

        Employee emp2 = new Employee(2020203, "Bob King", 37800.76, "It architect trainee");

        System.out.println(emp2.getAllInfo());
        emp2.reduceSalary(20000);
        System.out.println(emp2.getAllInfo());
        System.out.println(emp2.calcBonus(keyboardIn.nextDouble()));
        System.out.println(emp2.getAllInfo());

    }
}
