class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int best = nums[0] ;
        int ans = 0 ;

        for(int j = k ; j < nums.length ; j++){
            best = Math.max(best , nums[j-k]) ;
            ans = Math.max(ans , best + nums[j]) ;
        }

        return ans ;
    }
}