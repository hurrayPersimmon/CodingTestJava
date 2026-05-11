import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int leverDistance = getDistance(n,m,'S','L', maps);
        int exitDistance = getDistance(n,m,'L','E', maps);
        
        if(leverDistance == -1 || exitDistance == -1) return -1;
        return leverDistance + exitDistance;
        
    }
    
    public int getDistance(int n, int m,
                           char start, char target
                          , String[] maps
                          ){
        char wall = 'X';
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        boolean[][] visited = new boolean[n][m];
        Deque<int[]> queue = new ArrayDeque<>();
        
        int[] startPosition = getPosition(start,maps);
        queue.offer(startPosition);
        visited[startPosition[0]][startPosition[1]] = true;
        
        while(!queue.isEmpty()){
            int[] pop = queue.poll();
            int x = pop[0];
            int y = pop[1];
            int distance = pop[2];
            
            if(maps[x].charAt(y) == target) return distance;
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m)continue;
                if(maps[nx].charAt(ny) == wall) continue;
                if(visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx,ny,distance +1});
            }
        }
        return -1;
    }
    
    public int[] getPosition(char start, String[] maps){
        for(int i = 0; i<maps.length; i++){
            for(int j = 0; j<maps[i].length(); j++){
                if(maps[i].charAt(j) == start) return new int[] {i,j,0};
            }
        }
        return new int[]{};
    }
}