package task3;//Question2

public class Employee implements Taxable {
    // variable declare
    private int empId;
    private String name;
    private int salary;
    // constructor
    public Employee(int empId,String name,int salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    // calculate the tax for employee
    @Override
    public double calcTax() {
        return  (double) Math.round(salary * Taxable.incomeTax * 100) /100;
    }
}
