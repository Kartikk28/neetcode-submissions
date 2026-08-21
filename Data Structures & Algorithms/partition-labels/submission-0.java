class Solution {
    public List<Integer> partitionLabels(String s) {
       
        List<Integer> result = new ArrayList<>();
        
        // Pass 1: Record the last index of each character
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // Pass 2: Greedily expand boundaries and record partition sizes
        int size = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            size++;
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if (i == end) {
                result.add(size);
                size = 0; // Reset size for the next partition
            }
        }

        return result;
    }
}
  