class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] idx = {-1, -1};
        idx[0] = findBound(nums, target, true);  // first position
        idx[1] = findBound(nums, target, false); // last position
        return idx;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int lo = 0, hi = nums.length - 1;
        int res = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                res = mid;
                if (isFirst) {
                    hi = mid - 1;  // keep searching left
                } else {
                    lo = mid + 1;  // keep searching right
                }
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }
}
