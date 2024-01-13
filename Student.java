//Use a private keyword for a variable and use setter and getter methods to initialise and print the values.


public class Student {

    //Private data members
    private String name;
    private int rollNo;

    //Setter method to set name of the student
    public void setName(String name) {
        this.name = name;
    }

    //getter method to get name of the student
    public String getName() {
        return name;
    }

    //Setter method to set roll no of the student
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //Getter method to get roll no of the student
    public int getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {
        //Create object of Student class
        Student stud1 = new Student();
        Student stud2 = new Student();

        //Set values of name and roll no for student 1
        stud1.setName("Prashant Sahis");
        stud1.setRollNo(23);


        //Set values of name and roll no for student 2
        stud2.setName("Salman Khan");
        stud2.setRollNo(32);

        //Get values of the name and rol no of the student 1
        System.out.println("The name of the student1 is " +stud1.getName());
        System.out.println("The Roll No of the student1 is "+stud1.getRollNo());
        
        //Get values of the name and rol no of the student 1
        System.out.println("The name of the student2 is " +stud2.getName());
        System.out.println("The Roll No of the student2 is "+stud2.getRollNo());

    }

}
