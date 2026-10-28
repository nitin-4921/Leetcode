class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length , n = grid[0].length ;

        boolean[][][] vis = new boolean [m][n][1024];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0, grid[0][0]}) ;
        vis[0][0][grid[0][0]] = true ;

        int dx[] = {0,1};
        int dy[] = {1,0};

        int ans = Integer.MAX_VALUE ;

        while(!q.isEmpty()) {
            int cur[] = q.poll();
            int x = cur[0], y =cur[1] , xor = cur[2];

            if ( x == m-1 && y== n-1){
                ans = Math.min(ans , xor);
                continue ;
            }

            for(int d = 0 ; d < 2 ; d++){
                int nx = x + dx[d] ; 
                int ny = y + dy[d] ;

                if (nx < m && ny < n){
                    int newXor  = xor ^ grid[nx][ny];

                    if(!vis[nx][ny][newXor]){
                        vis[nx][ny][newXor] = true ;
                        q.add(new int[]{nx , ny , newXor});
                    }
                }
            }
        }

        return ans ;
        
    }
}