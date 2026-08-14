class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length==0) return false;
        int rowL = board.length;
        int colL= board[0].length;
        for(int i = 0 ; i< rowL ; i++){
            for(int j = 0 ; j<colL ; j++){
                   if(helperDfs(board, word, i, j, 0)){
                    return true;
                   }
                }
            }
            return false;
        }


        private boolean helperDfs(char[][] board, String word, int row, int col, int index){
            if(index== word.length()) return true;

            if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col] != word.charAt(index)){
                return false;
            }
            char temp = board[row][col];
            board[row][col]= '#';
            boolean found = 

            helperDfs(board, word, row+1, col, index+1) ||
            helperDfs(board, word, row -1, col, index+1) ||
            helperDfs(board, word, row, col+1,  index+1) ||
            helperDfs(board, word, row , col-1,  index+1);
            board[row][col]= temp;
            return found;



        }
    }

