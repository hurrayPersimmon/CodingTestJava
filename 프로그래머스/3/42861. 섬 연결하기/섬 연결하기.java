import java.util.*;

class Solution {

    public int solution(int n, int[][] costs) {
        List<int[]>[] graph = graphInit(n, costs);
        boolean[] visited = new boolean[n];

        // {도착 섬, 비용}
        PriorityQueue<int[]> pq =
            new PriorityQueue<>(Comparator.comparingInt(edge -> edge[1]));
        pq.offer(new int[]{0, 0});

        int answer = 0;
        int count = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();

            int island = current[0];
            int price = current[1];

            if (visited[island]) {
                continue;
            }

            visited[island] = true;
            answer += price;
            count++;

            if (count == n) {
                break;
            }

            for (int[] next : graph[island]) {
                int nextIsland = next[0];
                int nextPrice = next[1];

                if (!visited[nextIsland]) {
                    pq.offer(new int[]{nextIsland, nextPrice});
                }
            }
        }

        return answer;
    }
    
    public List<int[]>[] graphInit(int n, int[][] costs){
        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] cost : costs) {
            int from = cost[0];
            int to = cost[1];
            int price = cost[2];

            graph[from].add(new int[]{to, price});
            graph[to].add(new int[]{from, price});
        }
        return graph;
    }
}