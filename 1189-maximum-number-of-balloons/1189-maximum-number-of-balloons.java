class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int balloons = Math.min(
                Math.min(freq.getOrDefault('b', 0),
                         freq.getOrDefault('a', 0)),
                Math.min(
                        Math.min(freq.getOrDefault('l', 0) / 2,
                                 freq.getOrDefault('o', 0) / 2),
                        freq.getOrDefault('n', 0)
                )
        );

        return balloons ;
        
    }
}