class Solution {
    int answer, queenAmount, length;
    
    public int solution(int n) {
        
        length = n;
        answer = 0;        
        int queens[][] = new int [n][2];

        for(int i = 0; i<length; i++){
            queens[0][0] = i;
            queens[0][1] = 0;
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
        
        for(int i = 0; i<length; i++){
            int x = i;
            int y = queenAmount;
            
            if(isQueenPossible(x,y,queenAmount,queens)){
                queens[queenAmount][0] = x;
                queens[queenAmount][1] = y;
                queenAmount++;
                dfs(queens);
                queenAmount--;
            }
        }
        
    }
    
    public boolean isQueenPossible(int x, int y, int queenAmount, int[][]queens){
        for(int i = 0; i<queenAmount; i++){
            if(queens[i][0] == x) return false;
            if(queens[i][1] == y) return false;
            
            int dx[] = {-1,1,1,-1};
            int dy[] = {1,-1,1,-1};
            
            for(int j = 0; j<4; j++){
                int nx = queens[i][0];
                int ny = queens[i][1];
                
                while(nx>=0 && ny >=0 && nx < length && ny < length){
                    nx+= dx[j];
                    ny+= dy[j];
                    
                    if(x == nx && y == ny) return false;
                }
            }
        }
        
        return true;
        
    }
}