class Solution {
    
    int answer = 0;
    boolean[] visited;
    int n = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        n = dungeons.length;
        
        dfs(k, dungeons, 0);
        
        return answer;
    }
    
    public void dfs(int fatigue, int[][] dungeons, int count){
        answer = Math.max(answer, count);
        
        for(int i =0; i< n; i++){
            int required = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if(!visited[i] && fatigue >= required){
                visited[i] = true;
                
                dfs(fatigue - cost, dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
}