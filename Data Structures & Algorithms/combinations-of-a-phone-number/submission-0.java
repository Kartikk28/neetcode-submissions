

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        
        if (digits == null || digits.length() == 0) {
            return res;
        }

        
        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

       
        backtrack(digits, 0, new StringBuilder(), res, map);
        
        return res;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> res, String[] map) {
        // BASE CASE: If our built string length matches the input digits length
        if (index == digits.length()) {
            res.add(current.toString()); // Save the valid combination
            return;
        }

        // Get the letters corresponding to the current digit
        char digitChar = digits.charAt(index);
        String letters = map[digitChar - '0'];

        // Explore all choices (letters) for this digit
        for (char c : letters.toCharArray()) {
            current.append(c);                          // 1. CHOOSE (Add letter)
            backtrack(digits, index + 1, current, res, map); // 2. EXPLORE (Move to next digit)
            current.deleteCharAt(current.length() - 1); // 3. UNCHOOSE (Backtrack / remove letter)
        }
    }
}