class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
      if(hand.length% groupSize!=0){
        return false;
      }
      Map<Integer, Integer> map = new HashMap<>();

      for(int hehe: hand){
        map.put(hehe, map.getOrDefault(hehe, 0)+1);
      }
      Arrays.sort(hand);
      for(int hehe: hand){
        if(map.get(hehe) == 0){
            continue;
        }
      for(int i = hehe; i <hehe+ groupSize; i++){
        if(map.getOrDefault(i, 0) ==0){
            return false;
        }
        map.put(i, map.get(i) -1);
      }


      }
      return true;}}