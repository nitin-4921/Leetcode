class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0 ;
        boolean flag = true ;
        for (int a : arr1){
            flag = true ;
            for (int b : arr2){
                if (Math.abs(a - b) <= d ) {
                    flag = false ;
                }
            }

            if (flag){
                c++;
            }
        }

        return c ;
        
    }
}