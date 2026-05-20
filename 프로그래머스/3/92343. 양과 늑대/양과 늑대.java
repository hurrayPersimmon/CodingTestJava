import java.util.*;
class Solution {
    int answer;
    HashMap<Integer, List<Integer>> map;
    public int solution(int[] info, int[][] edges) {
        answer = 0;
        map = new HashMap<>();
        for(int i = 0; i<edges.length; i++){
            List<Integer> list = map.getOrDefault(edges[i][0], new ArrayList<Integer>());
            list.add(edges[i][1]);
            map.put(edges[i][0],list);
        }
        
        dfs(0,1,0,info,map.get(0));
        return answer;
    }
    public void dfs(int cur,int sheep,int wolf, int[] info, List<Integer> currentList){
        if(wolf >= sheep) return;
        answer = Math.max(answer, sheep);
        
        
        for(int i = 0; i<currentList.size(); i++){
            List<Integer> nextList = new ArrayList<>();
            int next = currentList.get(i);
            nextList.addAll(currentList);
            nextList.remove(i);
            nextList.addAll(map.getOrDefault(next, new ArrayList<>()));
            
            if(info[next] == 0) dfs(next, sheep +1, wolf, info, nextList);
            else dfs(next, sheep, wolf +1, info, nextList);
        }
        
    }
}