import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visited = new boolean[n][m];
        
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        Deque<int[]> queue = new ArrayDeque<>();
        
        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            
            int x = now[0];
            int y = now[1];
            int distance = now[2];
            
            //도착 완료
            if(x == n-1 && y == m-1){
                return distance;
            }
            
            //상하좌우
            for(int i = 0; i<4; i++){
                int nx = x+ dx[i];
                int ny = y+ dy[i];

                // 경계선 침범
                if(nx<0 || ny <0 || nx>= n || ny >= m)continue;
                // 방문 여부
                if(visited[nx][ny])continue;
                //벽
                if(maps[nx][ny] == 0)continue;

                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, distance +1});
            }
        }
        return -1;
    }
}