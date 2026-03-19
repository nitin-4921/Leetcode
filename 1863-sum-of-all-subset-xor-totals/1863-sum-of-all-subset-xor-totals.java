class Solution {

    int total = 0;

    public int subsetXORSum(int[] nums) {
        solve(nums, 0, 0);
        return total;
    }

    void solve(int[] nums, int index, int xor) {
        
        
        total += xor;

        for (int i = index; i < nums.length; i++) {
            solve(nums, i + 1, xor ^ nums[i]);
        }
    }
}