class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;

        for (int i = 1; i <= n; i++) {
            // When i reaches the next power of 2 (e.g., 2, 4, 8, 16)
            // update our offset
            if (offset * 2 == i) {
                offset = i;
            }

            // Number of 1s = 1 (for the new leading bit) + 1s from the remaining part
            dp[i] = 1 + dp[i - offset];
        }

        return dp;
    }
}