class Solution {
    public int largestRectangleArea(int[] heights) {
        return large(heights);
        
    }

    public static int large(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int h = arr[st.pop()];
                int r = i;

                if (st.isEmpty()) {
                    ans = Math.max(ans, h * r);
                } else {
                    int l = st.peek();
                    ans = Math.max(ans, h * (r - l - 1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.isEmpty()) {
            int h = arr[st.pop()];
            

            if (st.isEmpty()) {
                ans = Math.max(ans, h * r);
            } else {
                int l = st.peek();
                ans = Math.max(ans, h * (r - l - 1));
            }
        }

        return ans;
	}
}