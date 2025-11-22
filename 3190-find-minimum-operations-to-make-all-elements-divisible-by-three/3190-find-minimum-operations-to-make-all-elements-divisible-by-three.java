class Solution {
    public int minimumOperations(int[] nums) {
        int total = 0;
        for (int x : nums) {
            int r = x % 3;
            if (r != 0) {
                total += Math.min(r, 3 - r);
            }
        }
        return total;
    }
}
