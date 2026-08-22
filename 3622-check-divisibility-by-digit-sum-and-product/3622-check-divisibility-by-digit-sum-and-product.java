class Solution {
    public boolean checkDivisibility(int n) {
        int p = 1;
        int s = 0;
        int temp = n;

        while (temp > 0) {
            int d = temp % 10;
            s += d;
            p *= d;
            temp /= 10;
        }

        return n % (s + p) == 0;
    }
}