class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int[] arr = new int[m * n];

        // Flatten
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i * n + j] = grid[i][j];
            }
        }

        k %= arr.length;

        // Rotate
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }

        // Convert back
        List<List<Integer>> ans = new ArrayList<>();

        int idx = 0;

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(temp[idx++]);
            }

            ans.add(row);
        }

        return ans;
    }
}