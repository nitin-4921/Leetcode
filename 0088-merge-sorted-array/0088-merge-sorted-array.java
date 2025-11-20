class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int mer [] = new int [m+n] ;

        for (int i = 0 ; i < m ; i++){
            mer[i] = nums1[i];
        }

        for (int i = 0 ; i < n ; i++){
            mer[m+i] = nums2[i];
        }

        Arrays.sort(mer);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = mer[i];
        }
       
        
    }
}