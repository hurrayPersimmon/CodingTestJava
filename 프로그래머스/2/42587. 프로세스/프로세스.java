import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
            pq.offer(priorities[i]);
        }

        int order = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            // 현재 프로세스가 최고 우선순위라면 실행
            if (current[1] == pq.peek()) {
                pq.poll();
                order++;

                if (current[0] == location) {
                    return order;
                }
            } else {
                // 더 높은 우선순위가 있으면 뒤로 보냄
                queue.offer(current);
            }
        }

        return order;
    }
}