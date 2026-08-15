class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), list);
        return list;
        }


        private void helper(int[] nums, int start, List<Integer> list, List<List<Integer>> res){
            res.add(new ArrayList<>(list));
        
                for(int i=start; i<nums.length; i++){
            
                
                list.add(nums[i]);
                helper(nums, i+1,list, res);
                list.remove(list.size()-1);

                }

            }
    }

