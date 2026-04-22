import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] answer = new int[100];
        
        for(int progress : progresses){
            deque.offer(progress);
        }
        int day = (100 - progresses[0])/speeds[0];
        int index = 0;
        int length = progresses.length;
        int result = 0;
        
        while(!deque.isEmpty()){
            if(deque.peek()+ (day * speeds[index]) >=100){
                deque.poll();
                index++;
                continue;
            }
            
            if(length - deque.size() !=0){
                answer[result++] = length - deque.size();
                length = deque.size();
            }
            
            day++;
        }
        
        answer[result++] = length - deque.size();
        
        
        
         return Arrays.copyOf(answer, result);
    }
}