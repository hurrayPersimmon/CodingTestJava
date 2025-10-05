import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        LinkedList<Integer> checker = new LinkedList<>();
        for(int number : arr){
            if(checker.isEmpty() || number != checker.peekLast()){
                checker.add(number);
            }
        }
        
        int[] answer = new int[checker.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = checker.poll();
        }
        
        return answer;
    }
}