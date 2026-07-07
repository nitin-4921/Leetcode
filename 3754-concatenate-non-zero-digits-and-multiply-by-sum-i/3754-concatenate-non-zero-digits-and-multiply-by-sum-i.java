class Solution {
    public long sumAndMultiply(int n) {
        long rev = 0;
        int sum = 0;

        
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                rev = rev * 10 + d;
                sum += d;
            }
            n /= 10;
        }

       
        long x = 0;
        while (rev > 0) {
            x = x * 10 + rev % 10;
            rev /= 10;
        }

        return x * sum;
    }
}