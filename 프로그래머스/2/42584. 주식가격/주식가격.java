import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> indexStack = new ArrayDeque<>();

        for(int i = 0; i<prices.length; i++){
            while(!indexStack.isEmpty() && prices[indexStack.peek()] > prices[i]) {
                int index = indexStack.pop();
                answer[index] = i - index;
            }
            indexStack.push(i);
        }
        
        while(!indexStack.isEmpty()){
            int index = indexStack.pop();
            answer[index] = prices.length -1 - index;
        }
      
//         answer[prices.length-1] = 0;

//         for(int i = 0; i<prices.length-1; i++){
//             int count = 0;
//             int price = prices[i];
//             for(int j = i+1; j<prices.length; j++){
//                 count++;
//                 if(price > prices[j])break;
//             }
//             answer[i] = count;
//         }
        
        return answer;
    }
}