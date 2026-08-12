class Solution {
    public int maxProfit(int[] prices) {
        if(prices== null || prices.length==0) return 0;
        int maxP= 0;
         int minp= prices[0];
         for(int i =1 ; i< prices.length; i++){
            int profit= prices[i]- minp;
            maxP= Math.max(maxP, profit);
            if(prices[i]<minp){
                minp= prices[i];
            }
         }
         return maxP;
    }
}
