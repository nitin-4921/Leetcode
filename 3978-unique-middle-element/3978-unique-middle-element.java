class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length /2  ;

        int mid = nums[n] ;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == mid && i != n) {
                return false ;
            }
        }

        return true ;
        
    }
}