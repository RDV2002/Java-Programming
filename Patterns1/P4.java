
//Character Pattern

// package Pattens1;

public class P4 {
    public static void main(String[] args) {
        char ch = 'A';
        
        //outer loop
        for(int line = 1; line <= 4; line ++) {
            //inner loop
            for(int chars = 1; chars <= line; chars ++) {
                System.out.print(ch);
                ch ++;
            }
            System.out.println();
        }
    }
}
