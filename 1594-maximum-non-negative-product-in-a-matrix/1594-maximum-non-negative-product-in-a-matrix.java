class Solution {
    long[][][] dp;
    boolean[][] visited;
    int m, n;
    int MOD = 1000000007;

    public int maxProductPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        dp = new long[m][n][2]; // [max, min]
        visited = new boolean[m][n];

        long[] ans = dfs(grid, 0, 0);

        if (ans[0] < 0) return -1;

        return (int)(ans[0] % MOD);
    }

    public long[] dfs(int[][] grid, int r, int c) {

        // out of bounds
        if (r >= m || c >= n) {
            return new long[]{Long.MIN_VALUE, Long.MAX_VALUE};
        }

        // destination
        if (r == m - 1 && c == n - 1) {
            return new long[]{grid[r][c], grid[r][c]};
        }

        // 🔥 memoization (THIS FIXES TLE)
        if (visited[r][c]) {
            return dp[r][c];
        }

        long[] down = dfs(grid, r + 1, c);
        long[] right = dfs(grid, r, c + 1);

        long maxVal = Long.MIN_VALUE;
        long minVal = Long.MAX_VALUE;

        long[] candidates = new long[]{
            down[0], down[1],
            right[0], right[1]
        };

        for (long val : candidates) {
            if (val == Long.MIN_VALUE || val == Long.MAX_VALUE) continue;

            long prod = val * grid[r][c];

            maxVal = Math.max(maxVal, prod);
            minVal = Math.min(minVal, prod);
        }

        dp[r][c][0] = maxVal;
        dp[r][c][1] = minVal;
        visited[r][c] = true;

        return dp[r][c];
    }
}