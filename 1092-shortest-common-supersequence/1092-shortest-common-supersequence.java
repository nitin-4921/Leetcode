class Solution {

    public String shortestCommonSupersequence(String str1, String str2) {

        String lcs = getLCS(str1, str2);

        int i = 0, j = 0, k = 0;
        StringBuilder scs = new StringBuilder();

        while (k < lcs.length()) {

            while (str1.charAt(i) != lcs.charAt(k)) {
                scs.append(str1.charAt(i));
                i++;
            }

            while (str2.charAt(j) != lcs.charAt(k)) {
                scs.append(str2.charAt(j));
                j++;
            }

            scs.append(lcs.charAt(k));
            i++;
            j++;
            k++;
        }

        while (i < str1.length()) {
            scs.append(str1.charAt(i));
            i++;
        }

        while (j < str2.length()) {
            scs.append(str2.charAt(j));
            j++;
        }

        return scs.toString();
    }

    public String getLCS(String a, String b) {

        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        StringBuilder lcs = new StringBuilder();

        int i = m, j = n;

        while (i > 0 && j > 0) {

            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                lcs.append(a.charAt(i - 1));
                i--;
                j--;
            }
            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            }
            else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }
}