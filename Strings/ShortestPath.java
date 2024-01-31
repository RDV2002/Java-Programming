package Strings;

public class ShortestPath {
    public static double distance(String path) {
        int len = path.length();
        int x = 0, y = 0;
        for (int i = 0; i < len; i++) {
            // North
            if (path.charAt(i) == 'N')
                y++;
            // South
            else if (path.charAt(i) == 'S')
                y--;
            // East
            else if (path.charAt(i) == 'E')
                x++;
            // West
            else
                x--;
        }
        double sum = Math.pow(x, 2) + Math.pow(y, 2);
        double distance = Math.sqrt(sum);
        return distance;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("The shortest path => " + distance(path));
    }
}
