import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long leftTime = 1L;
        long maxTime = 0L;
        for (int t : times) maxTime = Math.max(maxTime, t);
        long rightTime = maxTime * (long) n;

        while (leftTime < rightTime) {
            long midTime = leftTime + (rightTime - leftTime) / 2;
            long done = 0;
            
            for (int t : times) {
                done += midTime / t;
                if (done >= n) break;
            }
            
            if (done >= n) {
                rightTime = midTime;
            } else {
                leftTime = midTime + 1;
            }
        }
        return leftTime;
    }
}