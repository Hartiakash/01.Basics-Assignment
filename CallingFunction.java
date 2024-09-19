package Basics_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_basics.html
 *
 * 6. Write a function to print your name and call the function from main method.
 */


public class CallingFunction {

    static void myMethod() {
        System.out.println("My Name is 'Akash Harti'");
    }

    public static void main(String[] args) {
        /* To call a method, you just need to type the method name
           followed by open and closed parentheses */
        myMethod();
    }
}

