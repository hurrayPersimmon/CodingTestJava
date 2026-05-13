import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Deque<int[]> queue = new ArrayDeque<>();
        boolean visited[] = new boolean [words.length];
        
        for(int i = 0; i<words.length; i++){
            if(isChangeable(begin, words[i])) {
                queue.offer(new int[]{i,1});
                visited[i] = true;
            }  
        }
        
        while(!queue.isEmpty()){
            int current[] = queue.poll();
            int cur = current[0];
            int distance = current[1];
            
            if(words[cur].equals(target)) return distance;
            
            for(int i = 0; i<words.length; i++){
                if(visited[i]) continue;
                if(cur == i) continue;
                if(isChangeable(words[cur], words[i])){
                    queue.offer(new int[]{i, distance +1});
                    visited[i] = true;
                } 
            }
        }
        return 0;
    }
    
    public boolean isChangeable(String begin, String next){
        int count = 0;
        
        for(int i = 0; i<begin.length(); i++){
            if(begin.charAt(i) == next.charAt(i)) count++;
        }
        
        return begin.length() - count == 1;
        
    }
}