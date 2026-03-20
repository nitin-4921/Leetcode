import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] ans = new int[n - k + 1][m - k + 1];

        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= m - k; j++) {

                // Step 1: collect k*k elements
                int[] arr = new int[k * k];
                int idx = 0;

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        arr[idx++] = grid[x][y];
                    }
                }

                // Step 2: sort
                Arrays.sort(arr);

                // Step 3: find min difference between DISTINCT values
                int min = Integer.MAX_VALUE;

                if (arr.length == 1) {
                    ans[i][j] = 0;
                    continue;
                }

                for (int r = 0; r < arr.length - 1; r++) {
                    if (arr[r] == arr[r + 1]) continue; // skip duplicates

                    int diff = arr[r + 1] - arr[r]; // sorted → no abs needed
                    min = Math.min(min, diff);
                }

                // if all values same
                if (min == Integer.MAX_VALUE) min = 0;

                ans[i][j] = min;
            }
        }

        return ans;
    }
}