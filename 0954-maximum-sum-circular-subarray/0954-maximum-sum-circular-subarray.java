class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return max_c_sum(nums);
    }
    public static int max_c_sum(int arr[]) {
		int linear_max_sum = kadanes (arr);
		
		int total_sum = 0 ;
		for (int i = 0 ; i < arr.length ; i++) {
			total_sum += arr[i];
			arr[i] = arr[i] * -1 ;
		}
		int circular_sum = total_sum + kadanes(arr);
		
		if ( circular_sum == 0) {
			return linear_max_sum ;
		}
		return Math.max(linear_max_sum, circular_sum);
	}
	
	public static int kadanes(int arr[]) {
		int ans = Integer.MIN_VALUE ;
		int sum = 0;
		for (int i = 0 ; i <arr.length ; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans ;
				

	}
}