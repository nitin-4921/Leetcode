class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length ;
        char c = letters[0] ;
        for (int i = 0 ; i < n ; i++){
            if (target < letters[i]){
                c = letters[i];
                break;
            }
        }

        return c ;

    }
}