package task3;//Question2

import java.util.Scanner;
public class DriverMain {
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         // input from user
         System.out.println("Enter employee ID:");
         int empId=scan.nextInt();
         scan.nextLine();
         System.out.println("Enter employee name:");
         String name=scan.nextLine();
         System.out.println("Enter employee salary:");
         int salary=scan.nextInt();
         // object create for employee
         Employee employee=new Employee(empId,name,salary);
         System.out.println("Income Tax for "+name+":"+employee.calcTax());

         System.out.println("Enter product ID:");
         int pid=scan.nextInt();
         System.out.println("Enter product price:");
         int price=scan.nextInt();
         System.out.println("Enter product quantity:");
         int quantity=scan.nextInt();
         // object create for product
         Product product =new Product(pid,price,quantity);
         System.out.println("Sales Tax for product with ID "+pid+":"+product.calcTax());

         scan.close();

     }
}
