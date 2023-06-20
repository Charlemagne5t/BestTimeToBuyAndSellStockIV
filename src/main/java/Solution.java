public class Solution {
    public int maxProfit(int k, int[] prices) {
        Integer[][][] memo = new Integer[k + 1][prices.length + 1][2];
        return dfs(k, prices, 0, 1, memo);
    }

    private int dfs(int k, int[] prices, int i, int ableToBuy, Integer[][][] memo) {
        if (i == prices.length) {
            return 0;
        }
        if (k == 0) return 0;

        if (memo[k][i][ableToBuy] != null) {
            return memo[k][i][ableToBuy];
        }
        int result = 0;

        if (ableToBuy == 1) {
            int doNothing = dfs(k, prices, i + 1, 1, memo);
            int buy = dfs(k, prices, i + 1, 0, memo) - prices[i];
            result = Math.max(doNothing, buy);
        }
        if (ableToBuy == 0) {
            int doNothing = dfs(k, prices, i + 1, 0, memo);
            int sell = dfs(k - 1, prices, i + 1, 1, memo) + prices[i];
            result = Math.max(doNothing, sell);
        }
        memo[k][i][ableToBuy] = result;
        return result;
    }
}
