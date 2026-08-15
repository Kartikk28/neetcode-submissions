class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>() ,nums, 0);
        return list;}





        private void backtrack(List<List<Integer>> list , List<Integer> list2, int[] nums, int start){

            list.add(new ArrayList<>(list2));
            for(int i =start ; i<nums.length; i++){
                if(i>start && nums[i]==nums[i-1]) continue;
                list2.add(nums[i]);
                backtrack(list, list2, nums, i+1);
                list2.remove(list2.size()-1);

            }}
        }
    

