import java.util.*;

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        result.add(""); 

        for (char c : s.toCharArray()) {
            int size = result.size();

            if (Character.isLetter(c)) {
                for (int i = 0; i < size; i++) {
                    String curr = result.get(i);
                    result.set(i, curr + Character.toLowerCase(c));    
                    result.add(curr + Character.toUpperCase(c));        
                }
            } else {
                for (int i = 0; i < size; i++) {
                    result.set(i, result.get(i) + c);
                }
            }
        }

        return result;
    }
}
