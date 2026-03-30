class Solution {
    public int hammingDistance(int x, int y) {
        
        int c = 0 ;
        int xor = x ^ y ;
        int mask = 1 ;
        for(int i = 0 ; i < 32 ; i++){
            if((xor & mask) != 0){
                c++;
            }
            mask <<= 1 ;
        }

        return c ;

        
    }
}