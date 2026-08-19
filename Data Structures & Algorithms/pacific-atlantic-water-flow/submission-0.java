// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

class Solution {
    private int rows;
    private int cols;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // Start DFS from Top & Bottom borders
        for (int c = 0; c < cols; c++) {
            dfs(0, c, heights, pacific, heights[0][c]);           // Top (Pacific)
            dfs(rows - 1, c, heights, atlantic, heights[rows - 1][c]); // Bottom (Atlantic)
        }

        // Start DFS from Left & Right borders
        for (int r = 0; r < rows; r++) {
            dfs(r, 0, heights, pacific, heights[r][0]);           // Left (Pacific)
            dfs(r, cols - 1, heights, atlantic, heights[r][cols - 1]); // Right (Atlantic)
        }

        // Find cells reachable by BOTH oceans
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }

        return result;
    }

    private void dfs(int r, int c, int[][] heights, boolean[][] visited, int prevHeight) {
        // Stop if out of bounds, already visited, or height is lower than previous (cannot flow uphill)
        if (r < 0 || c < 0 || r >= rows || c >= cols || visited[r][c] || heights[r][c] < prevHeight) {
            return;
        }

        visited[r][c] = true;

        // Explore 4 directions
        dfs(r + 1, c, heights, visited, heights[r][c]);
        dfs(r - 1, c, heights, visited, heights[r][c]);
        dfs(r, c + 1, heights, visited, heights[r][c]);
        dfs(r, c - 1, heights, visited, heights[r][c]);
    }
}