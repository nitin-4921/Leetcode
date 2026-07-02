class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int ans = 1;
        a %= MOD;

        for (int digit : b) {
            ans = pow(ans, 10) * pow(a, digit) % MOD;
        }

        return ans;
    }

    private int pow(int x, int n) {
        int res = 1;
        x %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            n >>= 1;
        }

        return res;
    }
}