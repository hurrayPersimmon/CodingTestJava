import java.util.*;

class Solution {
    public int solution(int[] scoville, long K) {
        int answer = 0;
        int length = scoville.length;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i = 0; i<length; i++){
            pq.offer((long)scoville[i]);    
        }
        
        while(pq.peek() < (long) K){
            if(pq.size() <2) return -1;
            Long a = pq.poll();
            Long b = pq.poll();
            pq.offer(a+ b*2);
            answer++;
        }
        
        return answer;
    }
}