class Solution {
    public int smallestNumber(int n) {

        int binaryInt = Integer.parseInt(Integer.toBinaryString(n));

        int count = 0 ; 
        while (binaryInt != 0) {
            binaryInt /= 10;
            count++;
        }


        int num = 0 ;
        for (int i = 1 ; i <= count ; i++){
            num *=10 ;
            num += 1 ;
            
        }

        
        int decimal = Integer.parseInt(String.valueOf(num), 2);

        return decimal ;



        
    }
}