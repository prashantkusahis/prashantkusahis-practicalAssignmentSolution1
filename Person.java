//Write a program and create a constructor with parameters and initialise the variable using a constructor.
public class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor with parameters for initialization
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating instances of Person with constructor parameters
        Person person1 = new Person("Prashant Sahis", 25);
        Person person2 = new Person("Salman Khan", 58);

        // Displaying information for each person
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
