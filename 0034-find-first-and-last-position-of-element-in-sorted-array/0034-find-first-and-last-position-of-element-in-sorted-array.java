class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int[] idx = {-1, -1};
        idx[0] = bs(nums, target, true);  
        idx[1] = bs(nums, target, false); 
        return idx;
    }

    public int bs(int[] nums, int t, boolean first) {
        int lo = 0, hi = nums.length - 1;
        int res = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == t) {
                res = mid;
                if (first) {
                    hi = mid - 1; 
                } else {
                    lo = mid + 1;  
                }
            } else if (nums[mid] < t) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }

    
}