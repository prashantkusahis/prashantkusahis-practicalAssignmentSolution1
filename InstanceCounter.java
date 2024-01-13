//Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish this.

public class InstanceCounter {
    // Static variable to keep track of the number of instances
    private static int instanceCount = 0;

    // Instance variable to store the instance number for each object
    private int instanceNumber;

    // Constructor increments the instance count and assigns an instance number
    public InstanceCounter() {
        instanceCount++;
        instanceNumber = instanceCount;
    }

    // Static method to get the total number of instances created
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Method to get the instance number for a specific object
    public int getInstanceNumber() {
        return instanceNumber;
    }

    public static void main(String[] args) {
        // Creating instances of InstanceCounter
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        // Accessing the total number of instances using the static method
        System.out.println("Total instances created: " + InstanceCounter.getInstanceCount());

        // Accessing the instance numbers for each object
        System.out.println("Instance number for obj1: " + obj1.getInstanceNumber());
        System.out.println("Instance number for obj2: " + obj2.getInstanceNumber());
        System.out.println("Instance number for obj3: " + obj3.getInstanceNumber());
    }
}
