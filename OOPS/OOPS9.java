
// Static Keyword Usage

public class OOPS9 {
    // Function is made static
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "GEC";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    // Function is made static
    static int returnPertcantage(int math, int chem, int phy) {
        return (math + chem + phy) / 3;
    }

    String name;
    int rollNumber;

    // property is made static
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}