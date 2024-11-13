//Question4

import java.util.HashMap;
import java.util.Scanner;
public class StudentGrades {
    //create Hash map
    private HashMap<String, Integer> grades;

    //create constructor
    public StudentGrades() {
        this.grades = new HashMap<>();
    }
    // add elements on hash map
    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }
    // remove elements on hash map
    public void removeStudent(String name) {
        grades.remove(name);
    }

    // get the mark for name 
    public Integer getGrade(String name) {
        return grades.get(name);
    }
    //display name and mark
    public void display() {
        for (String name : grades.keySet()) {
            System.out.println("Student: " + name + ", Grade: " + grades.get(name));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();
        String name;
        int grade;

        //add the name and grades using addStudent method
        while (true) {
            System.out.println("Enter a name (or type 'exit' to finish adding):");
            name = scan.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter a grade:");
            grade = scan.nextInt();
            scan.nextLine();

            studentGrades.addStudent(name, grade);
        }

        
        System.out.println("Would you like to remove a student? (yes/no)");
        String response = scan.nextLine();
         //remove student name and grade using removeStudent method
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the student to remove:");
            String nameToRemove = scan.nextLine();
            studentGrades.removeStudent(nameToRemove);
        }
        //display the all name and grades in hash map
        studentGrades.display();
    }
}
