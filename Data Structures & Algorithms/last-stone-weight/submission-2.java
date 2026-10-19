class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxH= new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            maxH.offer(num);
        }
        while(maxH.size()>1){
            int s= maxH.poll();
            int m= maxH.poll();
            
            
            if(m!=s){
                maxH.offer(s-m);
            }
        }

return maxH.isEmpty() ? 0: maxH.peek();}
        }