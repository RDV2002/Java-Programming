// package Pattens1;

public class P1_P1 {
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line ++) {
            for(int star = 1; star <= line+1; star ++) {
                if(line == 1 || line == 4) 
                    System.out.print("*");
                else {
                    if(star == 1||star == line+1) 
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
