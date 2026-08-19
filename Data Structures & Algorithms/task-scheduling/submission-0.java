

class Solution {
    public int leastInterval(char[] tasks, int n) {
        // 1. Count frequencies of each character
        int[] counts = new int[26];
        for (char c : tasks) {
            counts[c - 'A']++;
        }

        // 2. Max-Heap to store task frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int count : counts) {
            if (count > 0) {
                maxHeap.add(count);
            }
        }

        // 3. Queue stores pair of [remainingCount, availableTime]
        Queue<int[]> queue = new LinkedList<>();
        int time = 0;

        while (!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                int count = maxHeap.poll() - 1;
                if (count > 0) {
                    // Task can be used again at time + n
                    queue.add(new int[]{count, time + n});
                }
            }

            // Check if any task in queue is ready to go back to Max-Heap
            if (!queue.isEmpty() && queue.peek()[1] == time) {
                maxHeap.add(queue.poll()[0]);
            }
        }

        return time;
    }
}