//Question3

import java.util.Arrays;
import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        //array
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the day position from 0 to 6");
        int num= scan.nextInt();
        try{
            //print name of the day 
            System.out.println(weekdays[num]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Day position is outside the range (0-6)");
        }
    }
}


