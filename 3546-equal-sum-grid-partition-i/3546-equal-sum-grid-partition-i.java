class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = rsum(grid  );

        if(sum %2 != 0){
            return false ;
        }

        long target = sum /2 ;
       

        long curr = 0;

        for(int i = 0; i < grid.length - 1; i++){
            long rowSum = 0;
            for(int j = 0; j < grid[0].length; j++){
                rowSum += grid[i][j];
            }
            curr += rowSum;
            if(curr == target) return true;
        }

        curr = 0;

        for(int j = 0; j < grid[0].length - 1; j++){
            long colSum = 0;

            for(int i = 0; i < grid.length; i++){
                colSum += grid[i][j];
            }

            curr += colSum;

            if(curr == target) return true;
        }


        return false ;




        
        
    }

    public static long rsum(int[][] grid){
        long sum = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                sum += grid[i][j];
            }
        }

        return sum ;
    }
}