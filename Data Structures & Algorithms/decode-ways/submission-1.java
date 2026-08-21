class Solution {
    public int numDecodings(String s) {
        
  
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length(); // n = 5
        int dp2 = 1; // Base case: ways to decode s[0..-1] (empty string)
        int dp1 = 1; // Base case: ways to decode s[0..0] ("1")

        for (int i = 1; i < n; i++) {
            int current = 0;
            
            // 1. Single-digit check for s[i]
            if (s.charAt(i) != '0') {
                current += dp1;
            }
            
            // 2. Two-digit check for s[i-1..i]
            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
            if (twoDigit >= 10 && twoDigit <= 26) {
                current += dp2;
            }

            // Move state variables forward
            dp2 = dp1;
            dp1 = current;
        }

        return dp1;
    }
}