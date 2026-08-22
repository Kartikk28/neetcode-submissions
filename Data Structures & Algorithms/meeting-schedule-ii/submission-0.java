/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int count = 0 ; 
        if(intervals== null || intervals.isEmpty()) return 0;
        intervals.sort((a,b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(Interval interval : intervals){
            if(!heap.isEmpty() && heap.peek() <= interval.start){
                heap.poll();
            }
            heap.add(interval.end);}
            return heap.size();
    }}
    
    