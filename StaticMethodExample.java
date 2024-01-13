//Write a program to call a method without creating an object of a class.

public class StaticMethodExample {

    //static method to greet
    public static void greet(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        
        // Call the greet method from this class directly using the class name
        StaticMethodExample.greet();
    }
}
