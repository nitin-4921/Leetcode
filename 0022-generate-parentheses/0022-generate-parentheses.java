class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ll = new ArrayList<>();

        pane(n , 0 , 0 , "",ll);
        return ll;

    }

    public static void pane(int n , int open , int closed , String ans, List<String> ll){

        if (open ==n && closed == n){
            // System.out.println(ans);
            ll.add(ans);
            return ;
        }

        if(open > n || closed > open){
            return ;
        }




        pane(n , open +1 , closed , ans + "(", ll);
        pane(n , open , closed+1 , ans + ")" , ll);

    }
}