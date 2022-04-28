public class MaxWealth {
    public static void main(String[] args) {
        int accounts[][] = { { 1, 3, 4 }, { 2, 6, 2 } };
        int max = maxWealth(accounts);

        System.out.println("Max Wealth is: " + max);
    }

    static int maxWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int curSum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                curSum += accounts[i][j];
                maxWealth = Math.max(curSum, maxWealth);
            }
        }

        return maxWealth;
    }
}