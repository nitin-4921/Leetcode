class Solution {
    public int sumOfPower(int[] nums) {
        int MOD = 1_000_000_007;
        Arrays.sort(nums);

        long ans = 0;
        long prefix = 0;

        for (int x : nums) {
            long curr = (long) x * x % MOD;

           
            ans = (ans + curr * (x + prefix) % MOD) % MOD;

            
            prefix = (prefix * 2 + x) % MOD;
        }

        return (int) ans;
    }
}