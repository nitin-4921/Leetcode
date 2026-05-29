class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        for (int i = 0 ; i < n ; i++){
            int num = nums[i] ; 
            int sum = 0  ; 
            while(num >0 ){
                int d = num %10 ;
                sum += d ;
                num /= 10 ;

            }

            arr[i] = sum ;
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min  ;
        
    }
}