import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n; i>=1; i/=10){
            answer += i%10;
        }
            
        return answer;
    }
}