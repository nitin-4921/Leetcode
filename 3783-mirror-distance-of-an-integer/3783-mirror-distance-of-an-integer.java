class Solution {
    public int mirrorDistance(int n) {
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        return Math.abs(n - reversed);

    }
}