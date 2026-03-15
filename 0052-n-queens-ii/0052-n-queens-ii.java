class Solution {

    int count = 0;

    public int totalNQueens(int n) {

        boolean[][] board = new boolean[n][n];
        solve(board, n, 0);

        return count;
    }

    public void solve(boolean[][] board, int tq, int row) {

        if (tq == 0) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = true;

                solve(board, tq - 1, row + 1);

                board[row][col] = false; // backtrack
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col) {

        int r = row;
        int c = col;

        // up
        while (r >= 0) {
            if (board[r][c]) return false;
            r--;
        }

        // left diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) return false;
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) return false;
            r--;
            c++;
        }

        return true;
    }
}