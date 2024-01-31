import java.util.Scanner;

public class VDT_Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The arae of the square: " + area);
        sc.close();
    }
}
