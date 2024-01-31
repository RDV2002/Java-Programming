public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // Choice
        // Single
        int fnm1 = friendsPairing(n - 1);

        // Pairs
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // Total Ways
        int totalWays = fnm1 + pairWays;
        return totalWays;

        // return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2); --> Direct Statement
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
