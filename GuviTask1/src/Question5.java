import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the price:");
        //get input from user
        int price = scan.nextInt();
        //check price less than 0
        if(price<0)
            System.out.println("Please enter valid amount");
        //check price less than 500
        else if(price<500){
            System.out.println("No discount");
            System.out.println("Payable amount:"+price);
        }
        //check price greater than and equal to 500 & price less than and equal to 1000
        else if (price>=500 && price<=1000) {
            System.out.println("10% discount is applied");
            price= (int) (price-(price*0.1));
            System.out.println("Payable amount:"+price);
        }
        //price above 1000
        else {
            System.out.println("20% discount is applied");
            price= (int) (price-(price*0.2));
            System.out.println("Payable amount:"+price);
        }
    }
}
