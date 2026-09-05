class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length ;
        int min[] = new int [n] ;
        int max [] = new int[n] ;

        max[0] = nums[0] ;

        for(int i = 1 ; i < n ; i++) {
            max[i] = Math.max(nums[i] , max[i-1]) ;
        }

        min[n-1] = nums[n-1] ;

        for(int i = n-2 ; i >= 0 ; i--) {
            min[i] = Math.min(nums[i] , min[i +1]) ;
        }


        for(int i = 0 ; i < n ; i++) {
            if(max[i] - min[i] <= k) {
                return i ;
            }
        }

        return -1;
        
    }
}