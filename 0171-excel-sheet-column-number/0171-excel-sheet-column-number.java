class Solution {
    public int titleToNumber(String columnTitle) {

        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;  // Convert 'A' → 1, 'B' → 2, ...
            result = result * 26 + value;
        }

        return result;
        
    }
}