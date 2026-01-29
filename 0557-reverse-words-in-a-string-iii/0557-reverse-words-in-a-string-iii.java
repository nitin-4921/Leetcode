class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");

        String str = "";
        for (int i = 0 ; i < arr.length ; i++){
            str += new StringBuilder(arr[i]).reverse().toString() + " ";
        }
        

        return str.trim() ;

        
    }
}