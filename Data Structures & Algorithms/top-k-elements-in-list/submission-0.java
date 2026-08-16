class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums== null || nums.length ==0) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
    
        
    PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) ->            map.get(a).compareTo(map.get(b)));
        for(int n : map.keySet()){
            queue.offer(n);
            if(queue.size()> k){
                queue.poll();
            }

        }
         int[] hehe= new int[k];
        for(int i =0 ; i<k ; i++){
            hehe[i]= queue.poll();
        }
        return hehe;
    }
}
