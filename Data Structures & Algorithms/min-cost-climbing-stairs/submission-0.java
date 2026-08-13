class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = 0;  // Minimum cost to reach step 0
        int second = 0; // Minimum cost to reach step 1

        for (int i = 2; i <= cost.length; i++) {
            int current = Math.min(first + cost[i - 2], second + cost[i - 1]);
            first = second;
            second = current;
        }

        return second;
    }
}