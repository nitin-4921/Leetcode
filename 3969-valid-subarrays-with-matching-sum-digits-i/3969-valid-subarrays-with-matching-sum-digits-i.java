class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length ;
        int ans = 0 ; 

        for(int i = 0 ; i < n ; i++) {
            long sum = 0;

            for(int j = i ; j < n ; j++) {
                sum += nums[j] ;

                if(sum % 10 != x) continue ;

                long temp = sum ;
                while(temp >= 10) {
                    temp /= 10 ;
                }

                if(temp == x) {
                    ans++ ;
                }
            }
            
        }
        return ans;
        
    }
}