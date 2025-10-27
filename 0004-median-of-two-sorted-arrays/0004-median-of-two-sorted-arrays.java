class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length ; 
        int m = nums2.length ; 
        int l = m +n ;
        int arr [] = new int [l];
        
        
        int j = 0;
       
        for (int i = 0; i < n; i++) {
            arr[j] = nums1[i];
            j++;
        }

        
        for (int i = 0; i < m; i++) {
            arr[j] = nums2[i];
            j++;
        }


        Arrays.sort(arr);
        if (l % 2 != 0 ){
            int mid = arr.length /2 ;
            return arr[mid] ;
        }else {
            int mid1 = l / 2 - 1;
            int mid2 = l / 2;
            return (arr[mid1] + arr[mid2]) / 2.0;

        }

    


    }
}