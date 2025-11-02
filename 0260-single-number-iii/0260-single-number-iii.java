class Solution {
    public int[] singleNumber(int[] nums) {

        int n = nums.length  ;
        if (n == 0) return nums ;
        if (n==1) return nums ;

        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int i = 0 ; i < n ;){
            if (i == n - 1 || nums[i] != nums[i+1]){
                result.add(nums[i]);
                i++;
            }else {
                i+=2 ;
            }
        }

         return new int[]{result.get(0), result.get(1)};
        
    }
}