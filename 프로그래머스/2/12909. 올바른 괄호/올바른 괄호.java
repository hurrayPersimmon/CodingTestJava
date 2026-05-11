import java.util.*;
class Solution {
    boolean solution(String s) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         for(char x : s.toCharArray()){
//             if(x == '(') deque.push(1);
//             else{
//                 if(deque.isEmpty()) return false;
//                 deque.pop();
//             }   
//         }
        
//         return deque.isEmpty()? true : false;
        
        int count = 0;
        
        for(char x : s.toCharArray()){
            if(x == '(') count++;
            else count--;   
            if(count < 0) return false;
              
        }
        return count == 0;
    }
}