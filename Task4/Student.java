//Question1

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
    static int rollNo;
    static String name;
    static int age;
    static String course;
    
    boolean isValidName(String name){
        //pattern of name 
        boolean matches = Pattern.matches("[aA-zZ]+", name);
        return matches;
    }
   // create constructor throws exception
    public Student(int rollNo, String name, int age, String course)throws AgeNotWithinRangeException,NameNotValidException{
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.course=course;
        //check age is true then create exception
        if(age<15 || age>21){
            throw new AgeNotWithinRangeException("Age is not within a range");
        }
        // check name is not valid then create exception
        if(!isValidName(name)){
            throw new NameNotValidException("Name have numbers or special symbols");
        }
    }

    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a roll no:");
        rollNo= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a name:");
        name=scan.nextLine();
        System.out.println("Enter a age");
        age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a course");
        course=scan.nextLine();

        try{
            Student student=new Student(rollNo,name,age,course);
            System.out.println("Student information updated successfully.");
        }
        catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
//create exception class for age
class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}

//create exception class for name
class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}