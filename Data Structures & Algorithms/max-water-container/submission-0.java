class Solution {
    public int maxArea(int[] heights) {
        int start= 0 ;
        int end = heights.length-1;
        int maxA=0;
        while(start< end){
            int minH= Math.min(heights[start], heights[end]);
            int currA= minH* (end- start);
            maxA= Math.max(maxA, currA);
            if(heights[start]<heights[end]){
                start++;
            }
            else{
                end--;
            }

        }
        return maxA;
        
    }
}
