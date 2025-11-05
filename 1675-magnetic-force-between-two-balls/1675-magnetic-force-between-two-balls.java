class Solution {
    public int maxDistance(int[] position, int m) {

        int n = position.length-1;

        Arrays.sort(position);
        int lo = 1 ;
        int hi = position[n] - position[0];
        int ans = 0  ; 


        while (lo <= hi) {

            int mid = lo + (hi-lo)/2 ;
            if ( check(position , m , mid) ){
                ans = mid ;
                lo  = mid+1 ;

            }else {
                hi = mid-1 ;
            }
        }

        return ans ;

        
    }

    public static boolean check (int pos[] , int m , int dist){
        int count = 1 ;
        int last = pos[0];

        for (int i = 1 ; i < pos.length ; i++) {
            if (pos[i] - last >= dist){
                count++;
                last = pos[i];


                if (count ==m) return true ;
            }

        
        }
        return false ;
    }
}