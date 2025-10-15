class Solution {
    public boolean isPalindrome(String s) {

        String c  = s.replaceAll("[^a-zA-Z0-9]", "");

        c = c.toLowerCase();

        int l = 0 ; 
        int r = c.length()-1 ;

        while ( l < r ) {
            if (c.charAt(l) != c.charAt(r)){
                return false ;
            }
            l++;
            r--;
        }

        return true ;
        
    }
}