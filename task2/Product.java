//Question2

package guvi.task2;
import java.util.Scanner;
// create product class
public class Product {
    int pid;
    float price;
    int quantity;
// constructor
    Product(int pid, float price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}
//create xyz class
class XYZ {

    public static void main(String[] args) {
        // array
        Product[] products = new Product[5];

        Scanner scanner = new Scanner(System.in);
        // get input and store in product array
        for (int i = 0; i <5; i++) {
            System.out.println("Enter pid, price, and quantity for product: ") ;
            int pid = scanner.nextInt();
            float price = scanner.nextFloat();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

         // check highest price product and print it
        float maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (int i = 1; i < 5; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }
        System.out.println("Product with highest price has pid: " + maxPid);
         // print the total product price
        float totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

     // sum of total product price
    public static float calculateTotalAmount(Product[] products) {
        float total = 0.0f;
        for ( Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }
}
