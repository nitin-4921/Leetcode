class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n =  costs.length ;
        Arrays.sort(costs);

        int count = 0 ;
        long sum = 0 ;
        for(int i = 0 ; i < n ; i++) {
            sum += costs[i] ;
            if( sum <= coins){
                count ++ ;
            }
        }

        return count ;
        
    }
}