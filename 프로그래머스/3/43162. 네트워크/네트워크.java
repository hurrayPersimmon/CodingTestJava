import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean [n];
        
        for(int i = 0; i< n; i++){
            if(visited[i]) continue;
            
            queue.offer(i);
            visited[i] = true;
            
            while(!queue.isEmpty()){
                int cur = queue.poll();
                
                for(int j = 0; j<n; j++){
                    if(j == cur) continue;
                    if(visited[j]) continue;
                    if(computers[cur][j] == 1) {
                        queue.offer(j);
                        visited[j] = true;
                    }
                }
                
            }
            
            answer++;
            
            
        }
        
        return answer;
    }
}