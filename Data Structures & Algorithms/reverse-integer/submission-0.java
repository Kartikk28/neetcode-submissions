class Solution {
    public int reverse(int x) {
        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
   
        int result=0;

        if(x< min && x>max) return 0;
        
        while(x!=0){
        int digit= x%10;
        if(result>max/10 || result< min/10) return 0;
        result= (result*10) +digit;
        x/=10;
        }
        return result;
    }
}
