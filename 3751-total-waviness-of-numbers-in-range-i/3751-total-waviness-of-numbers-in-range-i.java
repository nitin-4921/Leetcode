class Solution {
    public int totalWaviness(int num1, int num2) {

        int wave = 0 ;
        while (num1 <= num2){
        
            int[] digit = String.valueOf(num1).chars().map(c -> c - '0').toArray();
            int n = digit.length;
            
            
            for(int i = 1 ; i < n-1 ; i++){
                if(digit[i] > digit[i-1] && digit[i] > digit[i+1]){
                    wave+=1;
                }
                if(digit[i] < digit[i-1] && digit[i] < digit[i+1]){
                    wave+=1 ;
                }


            }
            num1++;
        }
        return wave ;


        
        
    }
}