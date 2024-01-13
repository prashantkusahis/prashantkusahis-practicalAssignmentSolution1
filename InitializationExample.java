//Write a program which has static block and constructor overloading,initialise variables using constructors and print it.

public class InitializationExample {
    // Static block to be executed when the class is loaded
    static {
        System.out.println("Static block is executed.");
    }

    // Instance variables
    private String name;
    private int age;

    // Default constructor
    public InitializationExample() {
        System.out.println("Default constructor is called.");
        
    }

    // Constructor with parameters for initialization
    public InitializationExample(String name, int age) {
        System.out.println("Parameterized constructor is called.");
        this.name = name;
        this.age = age;
    }

    // Method to display information about the object
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating instances of InitializationExample with different constructors
        InitializationExample obj1 = new InitializationExample();
        InitializationExample obj2 = new InitializationExample("Prashant Sahis", 25);

        // Displaying information for each object
        System.out.println("\nObject 1:");
        obj1.displayInfo();

        System.out.println("\nObject 2:");
        obj2.displayInfo();
    }
}
