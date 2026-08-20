class Solution {
    public int rob(int[] nums) {
        int rob1= 0;
        int rob2=0;
        for(int n:nums){
            int sum = Math.max(n+rob1, rob2);
            rob1= rob2;
            rob2=sum;
        }
        return rob2;
        
    }
}
