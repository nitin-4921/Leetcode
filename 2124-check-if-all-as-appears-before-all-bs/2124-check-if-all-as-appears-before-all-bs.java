class Solution {
    public boolean checkString(String s) {
        int n = s.length();

        for (int i = 1 ; i < n ; i++){
            if (s.charAt(i) == 'a' && s.charAt(i-1) =='b'){
                return false;
            }
        }

        return true ;
        
    }
}