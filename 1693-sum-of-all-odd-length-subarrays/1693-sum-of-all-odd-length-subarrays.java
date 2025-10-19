class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        
        int total = 0;
        int n = arr.length;

        
        
       for (int len = 1; len <= n; len += 2) {  
            // Loop over all starting indices
            for (int start = 0; start <= n - len; start++) {
                for (int i = start; i < start + len; i++) {
                    total += arr[i];
                }
            }
        }

        return total ; 
    }
}