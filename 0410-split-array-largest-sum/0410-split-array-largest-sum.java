class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 0;
        int hi = 0;
        
        // Set lo = max single element, hi = sum of all elements
        for (int num : nums) {
            hi += num;
            lo = Math.max(lo, num);
        }
        
        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canSplit(nums, k, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        
        return ans;
    }
    
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1; // start with first subarray
        int sum = 0;
        for (int num : nums) {
            if (sum + num <= maxSum) {
                sum += num;
            } else {
                count++;       // need a new subarray
                sum = num;     // assign current element to new subarray
            }
            if (count > k) return false;
        }
        return true;
    }
}
