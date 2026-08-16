class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] hehe= new int[nums.length];
        
        hehe[0]=1;
        for(int i= 1; i<nums.length; i++){
            hehe[i]= hehe[i-1] *nums[i-1];
        }
        int product =1;
        for(int i =nums.length-1; i>=0 ; i--){
            hehe[i]= hehe[i]* product;
            product*= nums[i];
        

        }
        return hehe;
    }
}  
