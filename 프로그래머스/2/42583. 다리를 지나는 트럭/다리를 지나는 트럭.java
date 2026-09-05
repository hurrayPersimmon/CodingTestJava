import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> queue = new ArrayDeque<>();

        int answer = 0;
        int currentWeight = 0;
        int truckIndex = 0;

        int[] truckTime = new int[truck_weights.length];

        while (truckIndex < truck_weights.length || !queue.isEmpty()) {

            answer++;

            // 기존에 다리 위에 있던 트럭 시간 증가
            for (int index : queue) {
                truckTime[index]++;
            }

            // 가장 먼저 들어간 트럭이 다리를 다 건넜는지 확인
            if (!queue.isEmpty()) {
                int head = queue.peek();

                if (truckTime[head] > bridge_length) {
                    queue.poll();
                    currentWeight -= truck_weights[head];
                }
            }

            // 다음 트럭이 올라갈 수 있는지 확인
            if (truckIndex < truck_weights.length
                    && currentWeight + truck_weights[truckIndex] <= weight) {

                queue.offer(truckIndex);
                currentWeight += truck_weights[truckIndex];

                // 들어온 순간을 1초로 기록
                truckTime[truckIndex] = 1;

                truckIndex++;
            }
        }

        return answer;
    }
}