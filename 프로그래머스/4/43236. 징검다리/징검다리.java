import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        int left = 1;
        int right = distance;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int removed = 0;
            int prev = 0;

            for (int r : rocks) {
                if (r - prev < mid) {
                    removed++;
                } else {
                    prev = r;
                }
            }

            // 도착지점까지 마지막 거리도 확인
            if (distance - prev < mid) removed++;

            if (removed <= n) {
                answer = mid; // mid 가능
                left = mid + 1; // 더 큰 거리 도전
            } else {
                right = mid - 1; // 거리 줄임
            }
        }
        return answer;
    }
}
