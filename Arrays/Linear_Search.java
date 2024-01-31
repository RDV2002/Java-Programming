package Arrays;

public class Linear_Search {
    public static int linearsearch(String[] name, String key) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = {2,4,6,8,10,12,14,16,18,20};
        // int key = 1;
        String name[] = { "Ridikesh Vernekar", "Elon Musk", "Jeff Bezos", "Bill Gates" };
        String key = "Elon Musk";
        int index = linearsearch(name, key);
        if (index > -1)
            System.out.println("The element is at the index of " + (index + 1) + " in the array");
        else
            System.out.println("The element is not found in the array");
    }
}
