class Solution {
    
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        
        int[] result = new int[k];
        
        // try all splits
        for (int i = Math.max(0, k - n); i <= Math.min(k, m); i++) {
            
            int[] part1 = maxSubsequence(nums1, i);
            int[] part2 = maxSubsequence(nums2, k - i);
            
            int[] candidate = merge(part1, part2, k);
            
            if (greater(candidate, 0, result, 0)) {
                result = candidate;
            }
        }
        
        return result;
    }
    
    
    // 🔹 Step 1: Get max subsequence of length k
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] stack = new int[k];
        int top = -1;
        int remain = n - k;
        
        for (int i = 0; i < n; i++) {
            while (top >= 0 && stack[top] < nums[i] && remain > 0) {
                top--;
                remain--;
            }
            
            if (top + 1 < k) {
                stack[++top] = nums[i];
            } else {
                remain--;
            }
        }
        
        return stack;
    }
    
    
    // 🔹 Step 2: Merge two arrays greedily
    public int[] merge(int[] nums1, int[] nums2, int k) {
        int[] result = new int[k];
        int i = 0, j = 0, r = 0;
        
        while (r < k) {
            if (greater(nums1, i, nums2, j)) {
                result[r++] = nums1[i++];
            } else {
                result[r++] = nums2[j++];
            }
        }
        
        return result;
    }
    
    
    // 🔹 Step 3: Compare remaining arrays
    public boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        
        if (j == nums2.length) return true;
        if (i == nums1.length) return false;
        
        return nums1[i] > nums2[j];
    }
}