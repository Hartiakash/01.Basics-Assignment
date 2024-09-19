package Basics_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_basics.html
 *
 * 4. Define variables for different Data Types int, Boolean, char, float,
 * double and print on the Console
 */

public class DataType {
    public static void main(String[] args) {
        int i = 111;             // Default size is 4 byte
        float f = 11.1f;            // Default size is 4 byte
        double d = 111.1111;        // Default size is 8 byte
        char c = 'C';             // Default size is 2 byte
        boolean b = false;           // Default size is 1 byte

        System.out.println("This is an Integer "+i);
        System.out.println("This is a Float " + f);
        System.out.println("This is a Double " + d);
        System.out.println("This is a Char " + c);
        System.out.println("This is a Boolean " + b);
    }
}
