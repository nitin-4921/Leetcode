import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        solve(board, 0, ans);

        return ans;
    }

    public void solve(char[][] board, int row, List<List<String>> ans){

        if(row == board.length){
            ans.add(construct(board));
            return;
        }

        for(int col = 0; col < board.length; col++){

            if(isSafe(board, row, col)){

                board[row][col] = 'Q';

                solve(board, row + 1, ans);

                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col){

        // check column
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        // right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    public List<String> construct(char[][] board){

        List<String> res = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            res.add(new String(board[i]));
        }

        return res;
    }
}