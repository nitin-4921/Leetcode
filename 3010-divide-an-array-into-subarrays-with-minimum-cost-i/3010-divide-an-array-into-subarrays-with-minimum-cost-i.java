class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min2 = min;   
                min = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

        return sum + min + min2;
    }
}
