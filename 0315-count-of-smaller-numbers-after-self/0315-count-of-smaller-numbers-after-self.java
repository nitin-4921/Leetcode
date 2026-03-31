import java.util.*;

class Solution {
    private int[] count;
    private int[] index;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        index = new int[n];
        
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(nums, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int c : count) {
            result.add(c);
        }
        return result;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int i = left, j = mid + 1;
        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (nums[index[j]] < nums[index[i]]) {
                temp.add(index[j]);
                rightCount++;
                j++;
            } else {
                count[index[i]] += rightCount;
                temp.add(index[i]);
                i++;
            }
        }

        while (i <= mid) {
            count[index[i]] += rightCount;
            temp.add(index[i]);
            i++;
        }

        while (j <= right) {
            temp.add(index[j]);
            j++;
        }

        for (int k = left; k <= right; k++) {
            index[k] = temp.get(k - left);
        }
    }
}