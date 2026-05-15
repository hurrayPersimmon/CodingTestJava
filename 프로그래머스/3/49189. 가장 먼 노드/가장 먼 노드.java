import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int dist [] = new int[n];
        boolean visited[] = new boolean[n];
        
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{1,0});
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int current = cur[0];
            int distance = cur[1];
            
            for(int i = 0; i<edge.length; i++){
                if(current == edge[i][0]){
                    if(visited[edge[i][1] -1]) continue;
                    queue.offer(new int[] {edge[i][1], distance+1});
                    dist[edge[i][1]-1] = distance +1;
                    visited[edge[i][1]-1] = true;
                    
                    
                }
                if(current == edge[i][1]){
                    if(visited[edge[i][0]-1]) continue;
                    queue.offer(new int[] {edge[i][0], distance+1});
                    dist[edge[i][0]-1] = distance+1 ;
                    visited[edge[i][0]-1] = true;
                }
            }  
        }
        
        int max = 0;
        
        for(int i = 0; i<dist.length; i++){
            max = Math.max(dist[i], max);
        }
        
        for(int i = 0; i<dist.length; i++){
            if(max == dist[i]) answer++;
        }
        
        
    
        return answer;
    }
    
}