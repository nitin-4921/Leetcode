import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(s, current, ans);
        return ans;
    }

    private void backtrack(String s, List<String> current, List<List<String>> ans) {

        // Base Case
        if (s.length() == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Try every possible cut
        for (int i = 1; i <= s.length(); i++) {

            String prefix = s.substring(0, i);

            if (isPalindrome(prefix)) {

                current.add(prefix);                 
                backtrack(s.substring(i), current, ans);  
                current.remove(current.size() - 1); 
            }
        }
    }

    private boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
