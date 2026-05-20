class Solution {
    boolean[] visited;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i<n-1; i++){
            visited = new boolean[n-1];
            int startNode = wires[i][0];
            visited[i] = true;
            int count = dfs(startNode, wires);
            answer = Math.min(answer, Math.abs(2*count - n));
        }
        
        return answer;
    }
    
    public int dfs(int startNode, int[][]wires){
        int count = 1;
        
        for(int i = 0; i<wires.length; i++){
            if(visited[i]) continue;
            if(wires[i][0] == startNode){
                visited[i] = true;
                count += dfs(wires[i][1], wires);
            }
            if(wires[i][1] == startNode){
                visited[i] = true;
                count += dfs(wires[i][0], wires);
            }
        }
        return count;
        
    }
}