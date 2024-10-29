package task3;//Question2

public class Product implements Taxable {
    // variable declare
    private int pid;
    private int price;
    private int quantity;
    //constructor
    public Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    //calculate tax for product
    @Override
    public double calcTax() {
        return (double) Math.round(price* Taxable.salesTax * 100) /100;
    }
}
