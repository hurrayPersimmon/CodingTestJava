class Solution {
    int answer = 0;
    int queenAmount = 0;
    int length = 0;
    public int solution(int n) {
        length = n;
        for(int i = 0; i<n; i++){
            int[][] queens = new int[n][2];
            queens[0][0] = 0;
            queens[0][1] = i;
            queenAmount = 1;
            dfs(queens);
        }
        return answer;
    }
    
    public void dfs(int[][] queens){
        if(queenAmount == length){
            answer++;
            return;
        }
        
        for(int j = 0; j<length; j++){
            if(isQueenPossible(queenAmount,j,queens)){
                queens[queenAmount][0] = queenAmount;
                queens[queenAmount][1] = j;
                queenAmount++;
                dfs(queens);
                queenAmount--;
            }
        }
    }
    
    public boolean isQueenPossible(int x, int y, int[][] queens){
        for(int i = 0; i<queenAmount; i++){
            if(queens[i][0] == x || queens[i][1] == y) return false;
            
            int[] dx = {-1,-1,1,1};
            int[] dy = {1,-1,-1,1};
            for(int j = 0; j<4; j++){
                int nx = x+ dx[j];
                int ny = y+ dy[j];
                
                while(nx >= 0 && ny >= 0 && nx < length && ny < length){
                    if(nx == queens[i][0] && ny == queens[i][1]) return false;
                    nx += dx[j];
                    ny += dy[j];
                }
            }  
        }
        
        return true;
    }
}