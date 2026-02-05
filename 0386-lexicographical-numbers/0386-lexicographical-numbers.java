import java.util.*;

class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {
        dfs(0, n);
        return ans;
    }

    
    private void dfs(int curr, int n) {

        if (curr > n) {
            return;
        }

        if (curr != 0) {
            ans.add(curr);
        }

        int i = 0;
        if (curr == 0) {
            i = 1;
        }

        for (; i <= 9; i++) {
            dfs(curr * 10 + i, n);
        }
    }
}
