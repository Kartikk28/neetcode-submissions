class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
            }
            for(char d : t.toCharArray()){
            map2.put(d, map2.getOrDefault(d,0)+1);
            }
            return map.equals(map2);

            }
        }

