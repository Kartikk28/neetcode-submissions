class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, new ArrayList<>(), list, 0);
        return list;
        }


        private void helper(int[] candidates, int target, int start, List<Integer> list, List<List<Integer>> res, int sum){

            if( sum == target ){
                res.add(new ArrayList<>(list));
                return ;
            }

            if(sum>target) return;
            
                for(int i=start; i<candidates.length; i++){
                    if(i>start && candidates[i]== candidates[i-1]) continue;
            
                
                list.add(candidates[i]);
                helper(candidates, target, i+1,list, res, sum+candidates[i]);
                list.remove(list.size()-1);

                }

            }
        }
    