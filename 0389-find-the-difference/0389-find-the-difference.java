class Solution {
    public char findTheDifference(String s, String t) {

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        for (int i = 0 ; i < arrS.length ; i++){
            if (arrS[i] != arrT[i]){
                return arrT[i];
            }
        }

        

        

        return arrT[arrT.length - 1];
        
    }
}