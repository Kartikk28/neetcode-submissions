class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board== null || board.length==0) return false;
        Set<String> set = new HashSet<>();
        int row= board.length;
        int col = board[0].length;
        for(int i = 0 ; i < 9 ; i++){
            for(int j =0; j< 9 ; j++){
                char c= board[i][j];
                if(c!= '.'){
                    if((!set.add(c+ "row"+ i)) ||
                     (!set.add(c+"col"+j)) ||
                      (!set.add(c+"box"+i/3+j/3))){
                        return false;
                      }

                }}}
                return true;
                }
}
                    
    