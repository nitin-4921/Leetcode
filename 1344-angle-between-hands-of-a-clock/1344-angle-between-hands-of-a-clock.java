class Solution {
    public double angleClock(int hour, int minutes) {
        double min = minutes * 6.0;
        double hr = (hour % 12) * 30.0 + minutes * 0.5;

        double diff = Math.abs(hr - min);
        return Math.min(diff, 360.0 - diff);
    }
}