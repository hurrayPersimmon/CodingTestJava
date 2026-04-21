import java.util.*;
class Solution {
    boolean solution(String s) {
        Deque<String> deque = new ArrayDeque<>();
        for(String x : s.split("")){
            if(x.equals("(")) deque.push("(");
            else{
                if(deque.isEmpty()) return false;
                deque.pop();
            }   
        }
        
        return deque.isEmpty()? true : false;
        
//         boolean answer = false;
//         int index = 0;
//         int result = 0;
        
//         for(char x : s.toCharArray()){
//             if(x == '(') result++;
//             else result--;
            
//             index++;
            
//             if(result < 0 ||
//                index == s.length() && x == '(')
//                 return false;
              
//         }

//         return answer = result == 0 ? true : false;
    }
}