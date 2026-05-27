import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[] {0,0};
        int size = 0;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        
        for(String operation : operations){
            if(maxPQ.size() > 0 && size ==0){
                maxPQ = new PriorityQueue<>(Collections.reverseOrder());
                minPQ = new PriorityQueue<>();
            }
            char x = operation.charAt(0);
            if(x == 'I'){
                maxPQ.offer(Integer.parseInt(operation.substring(2)));
                minPQ.offer(Integer.parseInt(operation.substring(2)));
                size++;
            }
            
            if(x == 'D' && size > 0){
                if(operation.charAt(2) == '-') minPQ.poll();
                else maxPQ.poll();
                size--;
            }
        }
        
        if(size == 0) return new int[] {0, 0};        
        if(size == 1){
            if(maxPQ.size() < minPQ.size()) return new int[] {maxPQ.peek(), maxPQ.peek()};
            if(maxPQ.size() == minPQ.size()){
                boolean isMinus = false;
                for(int i = operations.length -1; i >=0; i--){
                    if(operations[i].charAt(0) == 'D'){
                        if(operations[i].charAt(2) == '-') isMinus = true;
                        else isMinus = false;
                        break;
                    }
                }
                if(isMinus) return new int[] {maxPQ.peek(), maxPQ.peek()};
                return new int [] {minPQ.peek(), minPQ.peek()};
            }
            else return new int [] {minPQ.peek(), minPQ.peek()};
        }
        
        return new int[] {maxPQ.peek(), minPQ.peek()};
    }
}