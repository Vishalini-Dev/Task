import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value" );
        //get input from user
        int i=scan.nextInt();
        //check i equal to 10
        if(i==10){
            //loop will execute until greater than 50
            while (i<=50){
                System.out.print(i);
                i++;
                System.out.print('\t');
            }
        }
    }
}
