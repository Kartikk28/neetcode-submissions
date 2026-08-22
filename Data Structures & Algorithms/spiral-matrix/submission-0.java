class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix== null) return null;
        List<Integer> list = new ArrayList<>();
        int r= matrix.length;
        int c= matrix[0].length;

        int top = 0;
        int bottom= r-1;
        int left= 0;
        int right= c-1;
        while(left<=right && top<=bottom){
            for(int i=left; i<=right ; i++){
                list.add(matrix[top][i]);}
                top++;
                
                for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);}
                right--;
                
                if(top<=bottom){
                for(int i=right; i>=left ; i--){
                list.add(matrix[bottom][i]);
                }
                bottom--;
                
            }
                if(left<=right){
                for(int i=bottom; i>=top ; i--){
                list.add(matrix[i][left]);}
                left++;
                }
        }
        return list;
                
            
            }
        }