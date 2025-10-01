class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int total = numBottles ;
        while ( numBottles >= numExchange){
            int n =  numBottles / numExchange ;
            int rem = numBottles % numExchange ;

            total += n;
            numBottles = rem+ n;

        }
        return total ;
    }
}