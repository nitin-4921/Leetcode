class Solution {
    public boolean judgeCircle(String moves) {
        int arr[] = {0,0};

        for (int i = 0 ; i < moves.length(); i++){
            if (moves.charAt(i) == 'L'){
                arr[0] += 1 ;
            }
            else if (moves.charAt(i) == 'R'){
                arr[0] -= 1 ;
            }
            else if(moves.charAt(i) == 'D'){
                arr[1] += 1 ;
            }
            else if(moves.charAt(i) == 'U'){
                arr[1] -= 1 ;
            }
        }


        int b[] = {0,0};
        if (Arrays.equals(arr,b)) return true ;

        return false ;

    }
}