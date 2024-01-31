
// Constructors

public class OOPS3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ridikesh";
        s1.rollNumber = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        s1.marks[2] = 100;
        // Student s1 = new Student();
        // Student s2 = new Student("Ridikesh");
        // Student s3 = new Student(20);

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNumber;
    String password;
    int marks[];

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Shallow Copy Constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollNumber = s1.rollNumber;
    // this.marks = s1.marks;
    // }

    // Non-parameterized Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    // Parameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println(this.name);
    }

    Student(int rollNumber) {
        marks = new int[3];
        this.rollNumber = rollNumber;
        System.out.println(this.rollNumber);
    }

}
