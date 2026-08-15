class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtracking(0, 0, n, "", list);
        return list;}

        public void backtracking(int openCount, int closeCount , int n, String current, List<String> list){

            if(openCount== n && closeCount==n){
                list.add(current);
                return;
            }
                if(openCount<n){
                    backtracking(openCount+1, closeCount,n, current + "(", list );
                }
                if(closeCount<openCount){
                    backtracking(openCount, closeCount +1,n,  current + ")", list);
                }

            }
        }

  