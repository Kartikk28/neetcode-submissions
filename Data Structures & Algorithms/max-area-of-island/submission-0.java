class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid== null || grid.length==0) return 0;
        int row1= grid.length;
        int col1 = grid[0].length;
        int maxA=0;
        int currentA=0;


        for(int i = 0; i< row1 ; i++){
           for(int j= 0 ; j< col1 ; j++){
            
            if(grid[i][j] ==1){
                currentA = dfs(grid, i, j);
                maxA=Math.max(maxA, currentA);
                
                
                
            }
           }
        }
           return maxA;
        }


            private int dfs(int[][] grid, int row, int col){
                if(row<0 || row>= grid.length || col<0 || col>=grid[0].length || grid [row][col]!=1){
                    return 0;
                }


                grid [row][col]= 0;

              return 1+  dfs(grid, row+1, col)+
                dfs(grid, row-1, col)+
                dfs(grid, row, col+1)+
                dfs(grid, row, col-1);

            }
           
           }
        
        
    
  