class Solution {
    public int earliestFinishTime(
        int[] landStartTime,
        int[] landDuration,
        int[] waterStartTime,
        int[] waterDuration
    ) {
        int minLandFinish = Integer.MAX_VALUE;
        int minWaterFinish = Integer.MAX_VALUE;

        // Earliest time we can finish any land ride
        for (int i = 0; i < landStartTime.length; i++) {
            minLandFinish = Math.min(minLandFinish, landStartTime[i] + landDuration[i]);
        }

        // Earliest time we can finish any water ride
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterFinish = Math.min(minWaterFinish, waterStartTime[i] + waterDuration[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Case 1: land ride first, then water ride
        for (int i = 0; i < waterStartTime.length; i++) {
            int finishTime = Math.max(minLandFinish, waterStartTime[i]) + waterDuration[i];
            ans = Math.min(ans, finishTime);
        }

        // Case 2: water ride first, then land ride
        for (int i = 0; i < landStartTime.length; i++) {
            int finishTime = Math.max(minWaterFinish, landStartTime[i]) + landDuration[i];
            ans = Math.min(ans, finishTime);
        }

        return ans;
    }
}