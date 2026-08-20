class Solution {
    public String longestPalindrome(String s) {
        if(s== null || s.length()<1) return "";
        int start=0, end=0;
        for(int i=0; i< s.length() ; i++){
        int len1= expandC(s , i , i );
        int len2 = expandC(s, i, i+1);
        int max= Math.max(len1, len2);
        if(max> end- start){
            start=  i - (max-1)/2;
        end = i + max/2;
        }
        }
        return s.substring(start, end+1);
    }
    
    
        
      private int expandC(String s, int left, int right){
        while(left>=0 && right< s.length() && s.charAt(left)== s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
      }

        }
        
    