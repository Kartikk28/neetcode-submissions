class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> list = new ArrayList<>();
        helper(nums, target, 0, new ArrayList<>(), list, 0);
        return list;
        }


        private void helper(int[] nums, int target, int start, List<Integer> list, List<List<Integer>> res, int sum){

            if( sum == target ){
                res.add(new ArrayList<>(list));
                return ;
            }

            if(sum>target) return;
            
                for(int i=start; i<nums.length; i++){
            
                
                list.add(nums[i]);
                helper(nums, target, i,list, res, sum+nums[i]);
                list.remove(list.size()-1);

                }

            }
        }
    
