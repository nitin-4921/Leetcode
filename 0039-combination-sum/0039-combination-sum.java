class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
		List<List<Integer>>ans = new ArrayList<>();
		
		c(candidates , target , ll , 0,ans);
		return ans;

    }


    public static void c(int coin[], int amount, List<Integer> ll, int idx,List<List<Integer>>ans) {

        if (amount == 0) {
            ans.add(new ArrayList<>(ll));
             
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
            	ll.add(coin[i]);	
                c(coin, amount - coin[i], ll , i , ans);
                ll.remove(ll.size() -1);
                
            }
        }

    }
}