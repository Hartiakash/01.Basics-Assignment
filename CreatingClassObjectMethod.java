package Basics_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_basics.html
 *
 * 1. How to create a class, object, method and its signature.
 */

// created a class using "class" keyword
public class CreatingClassObjectMethod {
    //created a method using methodName()
    void isMethod() {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Created an object of Basics_01
        CreatingClassObjectMethod obj = new CreatingClassObjectMethod();
        // Calling the method
        obj.isMethod();
    }
}
