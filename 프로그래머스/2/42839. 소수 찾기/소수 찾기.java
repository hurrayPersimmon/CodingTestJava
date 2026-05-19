import java.util.*;

class Solution {
    boolean[] visited;
    int answer;
    HashSet<Integer> set;
    public int solution(String numbers) {
        answer = 0;
        visited = new boolean[numbers.length()];
        set = new HashSet<Integer>();
        dfs(numbers, "");
        
        for(int number : set){
            if(isPrime(number)) answer++;
        }
        return answer;
    }
    
    public void dfs(String numbers, String target){
        
        for(int i = 0; i<numbers.length(); i++){
            if(visited[i]) continue;
            visited[i] = true;
            String next = target + numbers.charAt(i);
            set.add(Integer.parseInt(next));
            dfs(numbers, next);
            visited[i] = false;
            
        }
    }
    
    public boolean isPrime(int target){
        if(target < 2) return false;
        for(int i = 2; i<=Math.sqrt(target); i++){
            if(target % i== 0) return false;
        }
        return true;
    }
    
    
}