class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        int maxL= 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num :set){
            if(!set.contains(num-1)){
                int currS = num;
                int currL= 1;
                while(set.contains(currS+1)){
                    currS++;
                    currL++;
                }
                maxL = Math.max(maxL, currL);

            }
        }
        return maxL;
    }
}