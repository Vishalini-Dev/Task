//Question 1

package guvi.task2;
// create class
public class Person {
    static String name;
    static int age=18;
// create constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
// create method
    public void display(){
        System.out.println("Person Name: "+ name );
        System.out.println("Person age: "+ age);
    }

    public static void main(String[] args) {
        // create object
        Person person=new Person("john",age);
        // call method
        person.display();

    }
}
