class Solution {
    int length;
    boolean visited[];
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        length = wires.length;
        
        int node[]= new int[length-1];
        
        for(int i = 0; i<length; i++){
            int startNode = wires[i][0];
            visited = new boolean[length];
            visited[i] = true;
            answer = Math.min(answer, Math.abs(2*dfs(startNode, wires) - n));
        }
        
        return answer;
    }
    
    public int dfs(int startNode, int[][] wires){
        int count = 1;
        for(int i = 0; i<length; i++){
            if(visited[i]) continue;
            if(wires[i][0] == startNode){
                int nextNode = wires[i][1];
                visited[i] = true;
                count += dfs(nextNode, wires);
            }
            if(wires[i][1] == startNode){
                int nextNode = wires[i][0];
                visited[i] = true;
                count += dfs(nextNode, wires);
            }
        }
        
        return count;
    }
    
}