class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0 ;
        int n = grid[0].length ;
        int count= 0 ;
        for (int i = 0 ; i < grid.length ; i++) {
            int lo = 0, hi = n - 1;
            int firstneg = n; 

            while (lo <= hi) {
                int mid = (lo+hi)/2 ;
                if (grid[i][mid] < 0){
                    firstneg = mid ;
                    hi = mid -1 ;

                }else {
                    lo = mid +1 ;
                }
            }
             count += (n - firstneg);
            
        }

        return count ;
        
    }
}