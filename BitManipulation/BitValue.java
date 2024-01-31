
public class BitValue {
    public static void GetIthBit(int number, int i) {
        int bitMask = (1 << i);
        if ((number & bitMask) == 0)
            System.out.println("The bit value in the " + i + "th => 0");
        else
            System.out.println("The bit value in the " + i + "th => 1");

    }

    public static void SetIthBit(int number, int i) {
        int bitMask = (1 << i);
        System.out.println("The value of after Set Operation on the " + i + "th => "
                + (number | bitMask));
    }

    public static int ClearIthBit(int number, int i) {
        int bitMask = ~(1 << i);
        System.out.println("The value of after Clear Operation on the " + i + "th => "
                + (number & bitMask));
        return number & bitMask;
    }

    public static void UpdateIthBit(int number, int i, int newBit) {
        number = ClearIthBit(number, i);
        int bitMask = newBit << i;
        System.out.println("The value of after Update Operation on the " + i + "th => "
                + (number | bitMask));
    }

    public static void main(String[] args) {
        // GetIthBit(10, 2);
        // SetIthBit(10, 2);
        // ClearIthBit(10, 1);
        UpdateIthBit(10, 2, 1);
    }
}
