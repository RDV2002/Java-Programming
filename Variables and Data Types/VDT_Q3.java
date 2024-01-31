import java.util.*;
public class VDT_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cost_pen, cost_pencil, cost_eraser;
        System.out.println("Enter the price of the pen: ");
        cost_pen = sc.nextInt();
        System.out.println("Enter the price of the pencil: ");
        cost_pencil = sc.nextInt();
        System.out.println("Enter the price of the eraser: ");
        cost_eraser = sc.nextInt();
        System.out.println("Total Payable Amount: " + (cost_eraser + cost_pen + cost_pencil));
        sc.close();
    }
}
