class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0 ; i < nums.length -1  ; i+= 3){
            if ( i+1 >= n || nums[i] != nums[i+1] ){
                return nums[i];
            }
        }
        


        return nums[n-1];
    }
}