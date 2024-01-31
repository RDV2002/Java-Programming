import java.util.*;
public class P5 {
    public static void main(String args[]){
        System.out.println("Enter the marks obtained by the student: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks >= 33)?"PASS":"FAIL";
        System.out.println("The Result of the student is " +  result);
        sc.close();
    }
}
