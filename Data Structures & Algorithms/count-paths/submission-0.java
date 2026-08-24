class Solution {
    public int uniquePaths(int m, int n) {
      
        int[][] hehe= new int[m][n];
        for(int i =0 ; i< n; i++){
            hehe[0][i]=1;
        }
        for(int j =0 ; j< m; j++){
            hehe[j][0]=1;
        }
        for(int i =1 ; i< m; i++){
            for(int j =1 ; j< n; j++){
                hehe[i][j]= hehe[i-1][j] + hehe[i][j-1];
            
        }
        }
        return hehe[m-1][n-1];
    }
}
   
