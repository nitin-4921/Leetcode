class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        return ways(0 , arr, target) ;
    }

    public int ways(int i , int arr[] , int target) {
        if(i == arr.length) {
            if(target == 0) {
                return 1 ;
            }
            else return 0 ; 
        }
        int add = ways(i+1 , arr , target - arr[i]) ;
        int sub = ways(i+1 , arr , target + arr[i]) ; 
        return add + sub ;
    }
}