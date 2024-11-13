
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {
    //create stack
    private Stack<Integer> stack;
    //constructor
    public IntegerStack() {
        stack = new Stack<>();
    }
    
    public void push(int element) {
        //add element on stack 
        stack.push(element);
    }
    
    public int pop() {
        //check stack is not empty
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            throw new RuntimeException("Stack is empty, cannot pop an element.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //object creation
        IntegerStack integerStack = new IntegerStack();
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter the element to push or 'exit' to stop pushing:");
            String input=scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            else{
                try {
                    //add element on stack using push method
                    int element=Integer.parseInt(input);
                    integerStack.push(element);
                    System.out.println("Pushed element:"+element);
                }catch (NumberFormatException e){
                    System.out.println("Invalid input.Please enter a valid input");
                }
            }

        }
        boolean isPop = true;
        while (isPop && !integerStack.isEmpty()){
            System.out.println("Do you want to pop the element? (yes/no)");
            String input=scan.nextLine();
            if(input.equalsIgnoreCase("yes")){
                //remove the element on stack using pop method
                System.out.println("Popped element: " + integerStack.pop());
            } else if (input.equalsIgnoreCase("no")) {
                break;
            }else {
                System.out.println("Invalid input.Please enter yes or no");
            }
        }

        System.out.println("Is stack empty? " + integerStack.isEmpty());
    }
}