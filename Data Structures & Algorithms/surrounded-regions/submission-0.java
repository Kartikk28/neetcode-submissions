class Solution {
    private int r, c;
    public void solve(char[][] board) {
        if(board== null || board.length ==0) return;
        r = board.length;
        c = board[0].length;
        
        for(int i = 0 ; i< r ; i++){
            if(board[i][0]=='O') dfs(board, i, 0);
            if(board[i][c-1]=='O') dfs(board, i, c-1);
        }
        for(int j = 0 ; j< c ; j++){
            if(board[0][j]=='O') dfs(board, 0, j);
            if(board[r-1][j]=='O') dfs(board, r-1, j);
        }
        for(int i = 0 ; i< r ; i++){
            for(int j= 0 ; j< c ; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
        
    }

    public void dfs(char[][] board, int row, int col){
            if(row<0 || row >= r || col<0|| col>= c || (board[row][col]!='O')){
                return;
            }
            board[row][col] = '#';
            dfs(board, row+1, col);
            dfs(board, row-1, col);
            dfs(board, row, col+1);
            dfs(board, row, col-1);
        }

}

