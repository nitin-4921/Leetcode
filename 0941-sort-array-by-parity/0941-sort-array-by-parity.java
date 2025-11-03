class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length-1 ; 
        if (n==0 ) return nums;

        int lo = 0 ; 
        int hi = n ;

        while (lo <= hi) {
            if (nums[lo] % 2 > nums[hi] % 2) {
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
            }

            // Move lo forward if it's even
            if (nums[lo] % 2 == 0) lo++;

            // Move hi backward if it's odd
            if (nums[hi] % 2 == 1) hi--;
        }

        return nums;
        
    }
}