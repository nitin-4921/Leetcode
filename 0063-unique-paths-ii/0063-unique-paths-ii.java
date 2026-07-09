class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return paths(arr, 0, 0, m, n, dp);
    }

    private int paths(int[][] arr, int row, int col, int m, int n, int[][] dp) {

        // Out of bounds
        if (row >= m || col >= n)
            return 0;

        // Obstacle
        if (arr[row][col] == 1)
            return 0;

        // Destination reached
        if (row == m - 1 && col == n - 1)
            return 1;

        // Already computed
        if (dp[row][col] != -1)
            return dp[row][col];

        int right = paths(arr, row, col + 1, m, n, dp);
        int down = paths(arr, row + 1, col, m, n, dp);

        return dp[row][col] = right + down;
    }
}