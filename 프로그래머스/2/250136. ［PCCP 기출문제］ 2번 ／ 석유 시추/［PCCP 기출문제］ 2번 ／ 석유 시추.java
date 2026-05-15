import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int m = land[0].length;
        
        Deque<int[]> queue = new ArrayDeque<>();
        boolean visited[][] = new boolean[n][m];
        int[] oilArray = new int[m];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(land[i][j] == 1 &&!visited[i][j]) {
                    queue.offer(new int[] {i,j});
                    visited[i][j] = true;
                }
                else continue;
                
                boolean[] isOil = new boolean[m];
                int count = 1;
                
                while(!queue.isEmpty()){
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];
                    isOil[y] = true;
                    
                    int dx[] = {-1,1,0,0};
                    int dy[] = {0,0,-1,1};
                    
                    for(int k = 0; k<4; k++){
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if(nx < 0 || ny < 0 || nx >= n|| ny >= m) continue;
                        if(land[nx][ny] == 0) continue;
                        if(visited[nx][ny]) continue; 
                        
                        queue.offer(new int[]{nx,ny});
                        visited[nx][ny] = true;
                        
                        count++;
                    }
                }
                
                for(int l = 0; l<m; l++){
                    if(isOil[l]) oilArray[l] += count;
                }
            }
        }
        
        for (int oil : oilArray) {
            answer = Math.max(answer, oil);
        }
        
        
        return answer;
    }
}