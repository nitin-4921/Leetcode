class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int num = Math.abs(nums[i]);
            if (num == 0  && digit == 0){
                count++;
            }
            while (num > 0){
                int n = num % 10 ;
                if (n == digit){
                    count++;
                }
                num /= 10 ;
            }
        }

        return count ;
        
    }
}