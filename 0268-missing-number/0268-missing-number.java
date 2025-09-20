class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0 ;
        for (int num : nums){
            if (num != i){
                return i ;
            }
            i++;
        }
        return i ;
    }
}