package java2.week1;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTesterOne{

    public void main(String[] args){
        System.out.println("bob");

        ArrayList <Employee> empList = new ArrayList<>();
        Scanner keyboardIn = new Scanner(System.in);
        Employee firstEmployee = new Employee(1001,"Bob", 20000);
        Employee secondEmployee = new Employee(1023,"Mindy", 22000);
        Employee thirdEmployee = new Employee(1525, "Joan", 40000);
        
       
        empList.add(firstEmployee);
        empList.add(secondEmployee);
        empList.add(thirdEmployee);

        for(int i = 0; i < empList.size(); i++){
            System.out.println(empList.get(i).getSalary());

        }

        for(int i = 0; i < empList.size(); i++){
            System.out.println(empList);
        }






    }
}