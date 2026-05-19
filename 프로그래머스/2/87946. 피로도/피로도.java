class Solution {
    boolean[] visited;
    int answer, length;
    public int solution(int k, int[][] dungeons) {
        length = dungeons.length;
        visited = new boolean[length];
        answer = 0;
        dfs(k, 0, dungeons);
        
        return answer;
    }
    
    public void dfs(int fatigue, int count, int[][]dungeons){
        
       answer= Math.max(answer,count);
        
        for(int i = 0; i<length; i++){
            if(!visited[i] && fatigue >= dungeons[i][0]){
                visited[i] = true;
                dfs(fatigue - dungeons[i][1], count +1, dungeons);
                visited[i] = false;
            }
        }
        
    }
}