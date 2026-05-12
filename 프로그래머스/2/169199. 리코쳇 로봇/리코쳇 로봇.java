import java.util.*;

class Solution {
    public int solution(String[] board) {
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        int n = board.length;
        int m = board[0].length();
        
        Deque<int[]> queue = new ArrayDeque<>();
        int[] start = getPosition('R', board);
        queue.offer(start);
        boolean[][] visited = new boolean[n][m];
        visited[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            int distance = poll[2];
            
            if(board[x].charAt(y) == 'G') return distance;
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                while(nx >= 0 && nx < n &&
                    ny >= 0 && ny < m &&
                    board[nx].charAt(ny) != 'D'){
                    nx += dx[i];
                    ny += dy[i];
                }
                int stopX = nx - dx[i];
                int stopY = ny - dy[i];
                if (visited[stopX][stopY]) continue;
                
                queue.offer(new int[]{stopX, stopY, distance +1});
                visited[stopX][stopY] = true;
            }
        }       
        
        return -1;
    }
    
    public int[] getPosition(char target, String[] board){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length(); j++){
                if(board[i].charAt(j) == target) return new int[] {i, j, 0};
            }
        }
        return new int[]{};
    }
    
}