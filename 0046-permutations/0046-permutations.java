class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());  // start with empty list

        for (int num : nums) {
            List<List<Integer>> newPerms = new ArrayList<>();

            // For each existing permutation
            for (List<Integer> perm : result) {

                // Insert the new number in every possible position
                for (int i = 0; i <= perm.size(); i++) {
                    List<Integer> newPerm = new ArrayList<>(perm);
                    newPerm.add(i, num);  // insert num at index i
                    newPerms.add(newPerm);
                }
            }

            result = newPerms;  // update result for next iteration
        }

        return result;
    }
}
