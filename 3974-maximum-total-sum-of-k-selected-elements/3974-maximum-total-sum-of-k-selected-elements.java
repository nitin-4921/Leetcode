class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        int n = nums.length;
        long ans = 0;

        
        int t = Math.min(k, mul - 1);

        
        for (int i = n - k; i < n - t; i++) {
            ans += nums[i];
        }

        
        for (int i = n - 1; i >= n - t; i--) {
            ans += (long) nums[i] * mul;
            mul--;
        }

        return ans;
    }
}