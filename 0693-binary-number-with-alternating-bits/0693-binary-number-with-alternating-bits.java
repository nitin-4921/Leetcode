class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);

        int i = 0 ;
        while (i < s.length()-1){
            if(s.charAt(i) == s.charAt(i+1)){
                return false ;
            }
            i++;
        }

        return true ;
    }
}