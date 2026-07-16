class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length ;
        int mx = nums[0] ; 
        int prefix[] = new int[n] ;

        for(int i = 0 ; i < n ; i++) {
            if(nums[i] > mx) mx = nums[i] ;
            prefix[i] = gcd(nums[i] , mx) ;
        }
        Arrays.sort(prefix);

        int i = 0;
        int j = n - 1;

        long ans = 0;

        while (i < j) {
            ans += gcd(prefix[i], prefix[j]);
            i++;
            j--;
        }

        return ans;


    }

    public int gcd(int a , int b) {
        if(b == 0 ) {
            return a ;
        }

        return gcd ( b , a%b) ;
    }
}