class Solution {
    public int minMoves(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();

        int i = 0 ;
        int count = 0 ; 
        while ( i <= nums.length -1 ){
            if (nums[i] < max){
                nums[i]++;
                count++ ;
            }else {
                i++;
            }
        }

        return count ;
        
    }
}