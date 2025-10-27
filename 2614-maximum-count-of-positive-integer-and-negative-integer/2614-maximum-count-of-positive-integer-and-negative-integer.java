class Solution {
    public int maximumCount(int[] nums) {
        int negatives = firstIndex(nums, 0); // First index >= 0
        int positives = nums.length - firstIndex(nums, 1); // First index > 0
        return Math.max(negatives, positives);
    }

    private int firstIndex(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}