class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        
        while (num != 0 && sb.length() < 8) {
            int hexDigit = num & 15; 
            sb.append(map[hexDigit]);
            num >>>= 4; 
        }

        return sb.reverse().toString();
    }
}
