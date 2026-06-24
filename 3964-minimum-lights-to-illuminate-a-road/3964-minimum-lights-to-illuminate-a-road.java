class Solution {
    public int minLights(int[] lights) {
        int n = lights.length ;
        int diff[] = new int[n+1] ;

        for(int i = 0 ; i < n ; i++) {
            if(lights[i] > 0) {
                int v = lights[i] ;
                int l = Math.max(0 , i-v) ;
                int r = Math.min(n-1 , i+v) ;

                diff[l]++ ;
                if(r+1 < n) diff[r+1]-- ;
            }
        }
        boolean vis[] = new boolean[n] ;
        int cur = 0 ;

        for(int i = 0 ; i < n ; i++) {
            cur += diff[i] ;
            vis[i] = cur > 0 ;
        }

        
        int ans = 0 ; 
        int i = 0 ;

        while(i < n ) {
            if(vis[i]) {
                i++ ; 
                continue ;
            }

            int len = 0 ;
            while(i < n && !vis[i]) {
                len++ ;
                i++ ; 
            }

            ans += (len+2) / 3 ;
        }
        return ans ;
        
    }
}