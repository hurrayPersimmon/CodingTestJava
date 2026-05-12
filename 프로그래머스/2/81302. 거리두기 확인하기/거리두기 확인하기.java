import java.util.*;

class Solution {
    static final int AMOUNT = 5;
    
    public int[] solution(String[][] places) {
        int[] answer = new int[AMOUNT];
        for(int i = 0; i<AMOUNT; i++){
            answer[i] = isProtected(i, places[i]);
        }
        return answer;
    }
    
    public int isProtected(int index, String[] place){
        for(int i = 0; i<AMOUNT; i++){
            for(int j = 0; j<AMOUNT; j++){
                if(place[i].charAt(j)== 'P'){
                    if(isVirus(i, j, place)) return 0;
                }
            }    
        }
        return 1;
    }
    
    public boolean isVirus(int i, int j, String[] place){
        boolean[][] visited = new boolean[AMOUNT][AMOUNT];
        visited[i][j] = true;
        
        Deque<int[]> queue = new ArrayDeque<>();
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,1,-1};
        
        queue.offer(new int[] {i,j,0});
    
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            int distance = poll[2];
            if(distance > 2) continue;
            
                        
            if(distance > 0 && distance <=2 && place[x].charAt(y) == 'P') return true;
            for(int k = 0; k<4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                
                if(nx <0 || ny <0 || nx == AMOUNT || ny == AMOUNT) continue;
                if(place[nx].charAt(ny) == 'X') continue;
                if(visited[nx][ny]) continue;
                
                queue.offer(new int[] {nx, ny, distance + 1});
                visited[nx][ny] = true;
            }
            
        }
        return false;
        
    }
}