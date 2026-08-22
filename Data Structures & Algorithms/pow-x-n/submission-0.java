class Solution {
    public double myPow(double x, int n) {
        long number = n;
        if(number<0){
            x=1/x;
            number=-number;}

            double result = 1.0; 
            while(number>0){
                if(number%2==1){
                result*= x;}
            
            x*=x;
            number/=2;
            }
            return result;}
            
        }