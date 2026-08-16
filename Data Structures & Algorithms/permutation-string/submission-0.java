class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1== null || s2 == null) return false;
        if(s2.length()<s1.length()) return false;
        int[] char1= new int[26];
        int[] char2= new int[26];
        for(int i =0; i<s1.length(); i++){
            char1[s1.charAt(i) -'a']++;
             char2[s2.charAt(i) -'a']++;

        }
        for(int i = 0 ; i< s2.length()- s1.length() ; i++){
            if(Arrays.equals(char1, char2)) return true;

            char2[s2.charAt(i)- 'a']--;
            char2[s2.charAt(i+s1.length()) -'a']++;
        }
        return Arrays.equals(char1, char2);
    }
    
}
