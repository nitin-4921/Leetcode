class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        Arrays.sort(nums);
        int n = nums.length;

        // Precompute powers of 2 up to n
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }

        int lo = 0, hi = n - 1;
        int ans = 0;

        while (lo <= hi) {
            if (nums[lo] + nums[hi] <= target) {
                // all subsets between lo and hi are valid
                ans = (ans + pow2[hi - lo]) % mod;
                lo++;  // move to next larger min
            } else {
                hi--;  // reduce the max
            }
        }

        return ans;
    }
}
