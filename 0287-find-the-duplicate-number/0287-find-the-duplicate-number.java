class Solution {
    public int findDuplicate(int[] nums) {
        int lo = 1;
        int hi = nums.length - 1;
        int duplicate = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // Count how many numbers are <= mid
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                // Duplicate is in the lower half
                duplicate = mid;
                hi = mid - 1;
            } else {
                // Duplicate is in the upper half
                lo = mid + 1;
            }
        }

        return duplicate;
    }
}
