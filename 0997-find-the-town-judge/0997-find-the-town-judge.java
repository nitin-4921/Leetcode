class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] a = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = true;
        }

        int[] count = new int[n + 1];




        for (int i = 0; i < trust.length; i++) {
            a[trust[i][0]] = false; 
            count[trust[i][1]]++;   
        }
        

        for (int i = 1; i <= n; i++) {
            if (a[i] && count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}