class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int g = 0;


        int p = 0 ;
        while (n > 0) {
            if ((n&1) == 1){
                if (last != -1){
                    g = Math.max(g , p - last);
                }
                last = p ;
            }
            n >>=1 ;
            p++;
        }
        return g ;
    }
}