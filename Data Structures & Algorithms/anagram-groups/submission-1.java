class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
         if(strs ==null || strs.length ==0) return list;
        for(String s : strs){
           
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String hoho= new String(arr);
            if(!map.containsKey(hoho)){
                map.put(hoho, new ArrayList<>());
            }
            map.get(hoho).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
