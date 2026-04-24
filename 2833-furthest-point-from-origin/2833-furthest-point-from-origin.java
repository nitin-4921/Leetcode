class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length() ;

        int r = 0 ;
        int l = 0 ;
        int b = 0 ;
        for(int i = 0 ; i < n ; i++){
            if (moves.charAt(i) == 'R'){
                r++;
            }
            else if(moves.charAt(i) == 'L'){
                l++;
            }
            else {
                b++;
            }

        }

        if(l == 0 && r == 0){
            return n;
        }
        else if (l > r){
            return (b + l) - r ;
        }else {
            return (b+r) - l ;
        }
        
    }
}