package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Palindrome Word: " + isPalindrome(str));
    }
}