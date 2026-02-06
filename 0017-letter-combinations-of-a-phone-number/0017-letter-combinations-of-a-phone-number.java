class Solution {

    String[] key = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        // Edge case
        if (digits == null || digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "", ans);
        return ans;
    }

    private void backtrack(String digits, int idx, String curr, List<String> ans) {

        // Base case
        if (idx == digits.length()) {
            ans.add(curr);
            return;
        }

        char ch = digits.charAt(idx);
        String letters = key[ch - '0'];

        for (int i = 0; i < letters.length(); i++) {
            backtrack(digits, idx + 1, curr + letters.charAt(i), ans);
        }
    }
}
