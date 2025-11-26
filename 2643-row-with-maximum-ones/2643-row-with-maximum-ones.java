class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0 ;
        int row = 0 ;
        int count = 0 ;

        for (int i = 0 ; i < mat.length ; i++){
            for (int j = 0 ; j < mat[0].length ; j++){
                if (mat[i][j] == 1 ){
                    count++;
                }              
            }
            if (count > max){
                    max = count ;
                    row = i ;
            }
            count = 0 ;
        }

        int arr[] = new int [2];
        arr[0] = row ;
        arr[1] = max ;

        return arr;

    }
}