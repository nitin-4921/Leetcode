class Solution {
    public int minimumSum(int[][] grid) {
        
    int n = grid.length ;
		int m = grid[0].length ;
		int res = Integer.MAX_VALUE ;
		
		
		//case1 
		for (int i = 0 ; i < n ; i++) {
			for ( int j = i +1 ; j+1 < n ; j++) {
				res = Math.min(res, Find_min(grid , 0 , 0 , i , m-1) + Find_min(grid , i+1 ,0 , j , m-1)+ Find_min(grid , j+1 ,0 , n-1 , m-1) );
				
			}
		}
		
		
		//case2 
		for (int i = 0 ; i < m ; i++) {
			for ( int j = i +1 ; j+1 < m ; j++) {
				res = Math.min(res, Find_min(grid , 0,0 , n-1 , i) + Find_min(grid , 0 , i+1 , n-1 , j)+ Find_min(grid , 0 , j+1 , n-1 , m-1) );
				
			}
		}
		
		
		//case3 
		for (int i = 0 ; i+1 < n ; i++) {
			for ( int j = 0 ; j+1 < m ; j++) {
				res = Math.min(res, Find_min(grid , 0 , 0 , i , j) + Find_min(grid , 0 , j+1 , i , m-1)+ Find_min(grid , i+1 , 0 , n-1, m-1 ) );
				
			}
		}
		
		
		//case 4 
		for (int i = 0 ; i +1  < n ; i++) {
			for ( int j =0  ; j+1 < m ; j++) {
				res = Math.min(res, Find_min(grid ,0 ,0 , i , m-1) + Find_min(grid , i+1 ,0 , n-1  ,j)+ Find_min(grid , i+1 , j+1 , n-1 , m-1) );
				
			}
		}
		
		
		//case 5 
		for (int i = 0 ; i+1 < n ; i++) {
			for ( int j = 0 ; j+1 < m ; j++) {
				res = Math.min(res, Find_min(grid , 0 , 0 , i , j ) + Find_min(grid , i+1 ,0 , n-1 , j)+ Find_min(grid , 0  , j+1 , n-1 , m-1) );
				
			}
		}
		
		
		//case6
		//case6
		for (int i = 0 ; i +1  < n ; i++) {
			for ( int j = 0 ; j+1 < m ; j++) {
				res = Math.min(res, Find_min(grid , 0 , 0 , n-1 , j) + Find_min(grid , 0, j+1 , i, m-1)+ Find_min(grid , i+1 ,j+1 , n-1 , m-1) );
				
			}
		}
		
		
		
		
		
		return res ;
		
		
	}
	
	public static int Find_min(int [] [] grid , int cr , int cc , int er , int ec) {
		int minr = Integer.MAX_VALUE ;
		int maxr = Integer.MIN_VALUE ;
		int minc = Integer.MAX_VALUE ;
		int maxc = Integer.MIN_VALUE ;
		
		for (int i = cr ; i <= er ; i++) {
			for ( int j = cc ; j <= ec ; j++) {
				if ( grid[i][j] == 1) {
					minr = Math.min(minr,  i);
					maxr = Math.max(maxr, i);
					minc = Math.min(minc, j);
					maxc = Math.max(maxc, j);
					
					
					
				}
			}
		}
		return ((maxr - minr +1) * (maxc - minc +1));
				 
	}
}