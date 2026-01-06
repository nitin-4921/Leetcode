import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missing = new ArrayList<>();

        int n = nums.length;
        int c = 1;

        int i = 0; 
        while (c <= n) {
            if (i < n && nums[i] == c) {
                i++;
                c++;
            } else if (i < n && nums[i] < c) {
                
                i++;
            } else {
                
                missing.add(c);
                c++;
            }
        }

        return missing;
    }
}
