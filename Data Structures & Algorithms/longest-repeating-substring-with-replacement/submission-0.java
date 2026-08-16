class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0;
        int maxCount = 0; // Highest frequency of any single char in the current window
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            // 1. Add current character
            char cur = s.charAt(i);
            count[cur - 'A']++;
            maxCount = Math.max(maxCount, count[cur - 'A']);

            // 2. Shrink window if replacements needed > k
            // Replacements needed = (window length) - maxCount
            while ((i - start + 1) - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            // 3. Update maximum valid window size
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}