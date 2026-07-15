import java.util.*;

class Solution {

    static int dp[][];

    public int lcs(int i, int j, StringBuilder a, StringBuilder b) {

        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = 1 + lcs(i - 1, j - 1, a, b);
        }

        return dp[i][j] = Math.max(
                lcs(i - 1, j, a, b),
                lcs(i, j - 1, a, b)
        );
    }

    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        if (m == 0 || n == 0) return 0;

        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return lcs(m - 1, n - 1, new StringBuilder(text1), new StringBuilder(text2));
    }

    public int minDistance(String word1, String word2) {

        int lcs = longestCommonSubsequence(word1, word2);

        return word1.length() + word2.length() - 2 * lcs;
    }
}