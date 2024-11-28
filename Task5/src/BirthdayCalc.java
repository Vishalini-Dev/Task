//Question4

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdayCalc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your date od birth(YYYY-MM-DD):");
        String dateOfBirth=scan.nextLine();
        LocalDate birthDate=LocalDate.parse(dateOfBirth);
        LocalDate currentDate=LocalDate.now();
        Period age=Period.between(birthDate,currentDate);
        int year=age.getYears();
        int month=age.getMonths();
        int day=age.getDays();
        System.out.println("Your age is "+year+" years, "+month+" months and "+day+" days."
        );
    }

}
