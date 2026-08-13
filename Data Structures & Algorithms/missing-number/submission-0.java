class Solution {
    public int missingNumber(int[] nums) {
       
        int arraySum=0;
        
          int length= nums.length;
        int sum = (length*(length+1))/2;

        for(int i = 0 ; i< length; i++){
            arraySum+=nums[i];}
return sum- arraySum;}
       
}
