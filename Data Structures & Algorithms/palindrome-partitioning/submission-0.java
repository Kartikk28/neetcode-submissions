class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        backtrack(s, new ArrayList<>() , res, 0);
        return res;
        }

        private void backtrack(String s, List<String> curr, List<List<String>> res, int start){

            if(start== s.length()){
                res.add(new ArrayList<>(curr));
                return;
                }

                for(int i = start ; i< s.length() ; i++){
                    if(isPalindrome(s, start, i)){
                        curr.add(s.substring(start, i+1));   
                        backtrack(s, curr, res , i+1);
                        curr.remove(curr.size()-1); 
                    }
               }   
        }             


         private boolean isPalindrome(String s, int start, int end){
                       
            while(start<end){
                 if(s.charAt(start)!= s.charAt(end)) return false;
                    start++;
                    end--;
            }
                        return true;

                    }

                }
      
