import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int n = target.length();
        Deque<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        for(int i =0; i<words.length; i++){
            if(isChangeable(begin, words[i])){
                queue.offer(new int[]{i,1});
                visited[i] = true;
            }
        }
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int index = cur[0];
            int distance = cur[1];
            
            if(target.equals(words[index]))return distance;
            
            for(int i = 0; i<words.length; i++){
                if(visited[i])continue;
                if(!isChangeable(words[i], words[index])) continue;
                queue.offer(new int[]{i,distance+1});
                visited[i] = true;
                
            }
        }
        
        
        return 0;
    }
    
    public boolean isChangeable(String target, String string){
        int n = target.length();
        int count = 0;
        for(int i = 0; i<n; i++){
            if(target.charAt(i) == string.charAt(i)) count++;
        }
        
        return (n - count) == 1;
        
        
    }
    
}