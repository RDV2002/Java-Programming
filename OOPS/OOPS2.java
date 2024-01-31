public class OOPS2 {
    public static void main(String args[]) {
        Student s1 = new Student("Ridikesh");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int rollNumber;

    Student(String name) {
        this.name = name;
    }
}