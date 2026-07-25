class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr) ;
        int nu = arr.length ;
        return arr[nu-1] * arr[nu-2] ;
    }
}