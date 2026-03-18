class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        HashSet<Integer> set = new HashSet<>();
        
        solve(digits, used, 0, 0, set);
        
        return set.size();
    }

    public void solve(int[] digits, boolean[] used, int num, int len, HashSet<Integer> set) {
        
        if (len == 3) {
            set.add(num);
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i]) continue;

            if (len == 0 && digits[i] == 0) continue;

            if (len == 2 && digits[i] % 2 != 0) continue;

            used[i] = true;

            solve(digits, used, num * 10 + digits[i], len + 1, set);

            used[i] = false;
        }
    }
}