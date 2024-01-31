public class EvenOddNumber {
    public static void Type(int number) {
        if ((number & 1) == 0)
            System.out.println("The number is an Even Number!!");
        else
            System.out.println("The number is an Odd Number!!");
    }

    public static void main(String[] args) {
        Type(100);
    }
}