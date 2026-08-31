class Solution {
    public int minEatingSpeed(int[] piles, int k) {
        int lo = 1 ;
        int hi = piles[0] ;
        for (int i : piles) {
            if(i > hi){
                hi = i ;
            }
        }

        while (lo < hi) {
            int mid = lo +(hi - lo) /2 ;
            long h = 0 ;

            for(int i = 0 ; i < piles.length ; i++) {
                h += (piles[i] + mid -1) / mid ;
            }

            if (h <= k) {
                hi = mid ;
            }else {
                lo = mid +1 ;
            }
        }

        return lo;
    }
}