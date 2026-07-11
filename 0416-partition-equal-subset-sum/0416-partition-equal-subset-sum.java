class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return subset(0, nums, target, dp);
    }

    private boolean subset(int i, int[] nums, int target, Boolean[][] dp) {

        if (target == 0) {
            return true;
        }

        if (i == nums.length || target < 0) {
            return false;
        }

        if (dp[i][target] != null) {
            return dp[i][target];
        }

        boolean take = subset(i + 1, nums, target - nums[i], dp);
        boolean skip = subset(i + 1, nums, target, dp);

        return dp[i][target] = take || skip;
    }
}