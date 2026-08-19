class Solution {
    public void islandsAndTreasure(int[][] grid) {

        if (grid == null || grid.length == 0) return;

        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all treasure chests (0) to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Step 2: Multi-Source BFS outwards
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                // Skip if out of bounds, water (-1), or already visited (not INF)
                if (nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] != Integer.MAX_VALUE) {
                    continue;
                }

                // Distance is 1 + distance of current chest/cell
                grid[nr][nc] = grid[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
        }
    }
}
  
