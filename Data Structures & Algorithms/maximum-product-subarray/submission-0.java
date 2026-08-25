class Solution {
    public int maxProduct(int[] nums) {
        // Track global max, current max product, and current min product
        int res = nums[0];
        int curMax = 1;
        int curMin = 1;

        for (int n : nums) {
            // Store curMax before updating because curMin needs the old curMax value
            int temp = curMax * n;
            
            // New max product can be: starting new (n), old max * n, or old min * n (if n is negative)
            curMax = Math.max(n, Math.max(temp, curMin * n));
            
            // New min product can be: starting new (n), old max * n, or old min * n
            curMin = Math.min(n, Math.min(temp, curMin * n));

            // Update overall global maximum
            res = Math.max(res, curMax);
        }

        return res;
    }
}