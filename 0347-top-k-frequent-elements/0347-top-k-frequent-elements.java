
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                map.put(nums[i - 1], count);
                count = 1;
            }
        }
        
        map.put(nums[n - 1], count);

       
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}