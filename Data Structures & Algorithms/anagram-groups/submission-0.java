class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c= s.toCharArray();
            Arrays.sort(c);
            String hehe= new String(c);
            if(!map.containsKey(hehe)){
            map.put(hehe, new ArrayList<>());
            }
            map.get(hehe).add(s);
        }

            return new ArrayList<>(map.values());
        }
    }
