class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int x = 1; x <= amount; x++) {
            for (int coin : coins) {
                if (x - coin >= 0) {
                    dp[x] = Math.min(dp[x], 1 + dp[x - coin]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}