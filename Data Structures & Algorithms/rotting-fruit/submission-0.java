class Solution {
    public int orangesRotting(int[][] grid) {
         if(grid== null || grid.length==0) return 0;
        int row1= grid.length;
        int col1 = grid[0].length;
        Queue<int[]> queue= new LinkedList<>();
        int freshCount= 0;

        for(int i = 0; i< row1 ; i++){
           for(int j= 0 ; j< col1 ; j++){
              if(grid [i][j] ==2){
                queue.offer(new int[]{i,j});
                }
            else if(grid [i][j] ==1){
                freshCount++;
            }
           }
        }
        if(freshCount== 0) return 0;
        int minutes= 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while(!queue.isEmpty() && freshCount>0){
            int size = queue.size();
            for(int i = 0; i< size ; i++){
                int[] curr= queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] dir:directions){
                    int nr= r+dir[0];
                    int nc= c+dir[1];
                    if(nr>= 0 && nr<row1 && nc>=0 && nc<col1 && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        freshCount--;
                        queue.offer(new int[]{nr, nc});

                    }
                }
               
                }
                minutes++;
            }
        
        return freshCount == 0 ? minutes : -1;

    }
    }