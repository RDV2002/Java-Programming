public class StringCompressionProblem {
    public static String Compression(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        int count = 1;
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (ch == str.charAt(i))
                count++;
            else {
                if (count != 1) {
                    sb.append(count);
                }
                ch = str.charAt(i);
                sb.append(ch);
                count = 1;
            }
        }
        if (count != 1) {
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbacccdddd";
        System.out.println("The Compressed String => " + Compression(str));
    }
}
