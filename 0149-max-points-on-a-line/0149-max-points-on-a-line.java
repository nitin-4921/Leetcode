class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) return n;

        int ans = 2;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int count = 2;

                long x1 = points[i][0];
                long y1 = points[i][1];
                long x2 = points[j][0];
                long y2 = points[j][1];

                for (int k = j + 1; k < n; k++) {

                    long x3 = points[k][0];
                    long y3 = points[k][1];

                    if ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)) {
                        count++;
                    }
                }

                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}   