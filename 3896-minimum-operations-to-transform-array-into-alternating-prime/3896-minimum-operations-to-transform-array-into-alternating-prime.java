class Solution {
    static boolean[] isPrime ;
    public int minOperations(int[] nums) {
        int max =200000 ;
        sieve(max);
        int ops = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];

            if (i%2 == 0){
                if(!isPrime[num]) {
                    int x = num ;
                    while(!isPrime[x]){
                        x++;
                    }
                    ops += (x - num);
                }
            }else {
                if(isPrime[num]){
                    int x = num ;
                    while (isPrime[x]){
                        x++;
                    }
                    ops += (x-num);
                }
            }
        }
        return ops ;
        
    }

    private void sieve(int n){
        isPrime = new boolean[n+1];
        for(int i = 2 ; i <= n ; i++) {
            isPrime[i] = true ;
        }

        for(int i = 2 ; i * i <= n ; i++){
            if(isPrime[i]){
                for(int j = i * i ; j <= n ; j+=i){
                    isPrime[j] = false ;
                }
            }
        }
    }
}