class Solution {
    public int findLongestChain(int[][] pairs) {


        Arrays.sort(pairs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1]; // sort by 2nd value
            }
        });

        
        int end = pairs[0][1];
        int count = 1;

        // Step 2: Greedy selection
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > end) {
                count++;
                end = pairs[i][1];
            }
        }

        return count;
        
    }
}