package guvi.task2;
// Question4
// create parent class
public class PersonParent {
    protected String name;
    protected int age;
    //create a constructor of parent class
    PersonParent(String name,int age){
        this.name=name;
        this.age=age;
    }
}
// create child class 
class Employee extends PersonParent {
    String employeeId;
    double salary;
    // constructor of child class
    public Employee(String name, int age, String employeeId,double salary) {
        super(name, age);
        this.employeeId=employeeId;
        this.salary=salary;
    }

 
    public static void main(String[] args) {
        //create object and print.
        Employee emp=new Employee("John",20,"101010",100000);
        System.out.println("Name:"+ emp.name);
        System.out.println("Age:"+emp.age);
        System.out.println("EmployeeId:"+emp.employeeId);
        System.out.println("Salary:"+emp.salary);
    }
}
