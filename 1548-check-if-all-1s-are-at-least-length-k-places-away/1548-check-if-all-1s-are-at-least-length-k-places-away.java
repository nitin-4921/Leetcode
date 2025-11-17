class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean flag = true ;
        int count = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                
                if (count != -1 && count < k) {
                    flag = false;
                    break;
                }
                count = 0; 
            } 
            else { 
                if (count != -1) count++; 
            }
        }

        return flag ; 
        
    }
}