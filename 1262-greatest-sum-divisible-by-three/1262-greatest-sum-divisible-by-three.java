class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();

        for (int x : nums) {
            sum += x;
            if (x % 3 == 1) r1.add(x);
            else if (x % 3 == 2) r2.add(x);
        }

        int r = sum % 3;

        if (r == 0) return sum;  

        
        Collections.sort(r1);
        Collections.sort(r2);

        int remove = Integer.MAX_VALUE;

        if (r == 1) {
            if (!r1.isEmpty()) remove = Math.min(remove, r1.get(0));
            if (r2.size() >= 2) remove = Math.min(remove, r2.get(0) + r2.get(1));
        }
        else {   
            if (!r2.isEmpty()) remove = Math.min(remove, r2.get(0));
            if (r1.size() >= 2) remove = Math.min(remove, r1.get(0) + r1.get(1));
        }

       

        return sum - remove;
    }
}
