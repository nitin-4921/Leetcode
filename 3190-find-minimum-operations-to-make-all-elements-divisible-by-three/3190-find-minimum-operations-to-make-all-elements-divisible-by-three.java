class Solution {
    public int minimumOperations(int[] nums) {

        boolean flag = true ;
        int n = 0 ;
        int count = 0 ;

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] % 3 != 0){
                flag = false ;
                count ++;
                
            }
        }

        if (flag) return 0 ;
        
        return count ;


        
    }
}