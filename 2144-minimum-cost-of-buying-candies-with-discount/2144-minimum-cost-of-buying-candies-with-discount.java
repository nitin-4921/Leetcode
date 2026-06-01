class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int max = 0 ;
        int n = cost.length ;
        int j = 2 ;

        for (int i = n -1 ; i >= 0 ; i-- ){

            if (j > 0 ){
                max += cost[i] ;
                j--;

            }

            else {
                j = 2 ; 
                continue ;
            }
        }


        return max;
        
    }
}