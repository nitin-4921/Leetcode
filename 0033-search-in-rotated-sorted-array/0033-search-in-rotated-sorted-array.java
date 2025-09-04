class Solution {
    public int search(int[] nums, int target) {
        int lo = 0 ;
		int hi = nums.length - 1;
		while (lo <= hi) {
			int mid = (lo+hi) /2 ;
			if(nums[mid] == target) {
				return mid ;
			}
			else if (nums[lo] <= nums[mid] ) {//upper line
				if (nums[lo] <= target && nums[mid] > target) {
					hi = mid -1 ;
				}else {
					lo = mid + 1 ;
				}
				
			}else { // lower line
				if (nums[hi] >= target && nums[mid] < target) {
					lo = mid + 1 ;
				}else {
					hi = mid - 1 ;
				}
				
			}
    }
			return -1 ;
    }
}