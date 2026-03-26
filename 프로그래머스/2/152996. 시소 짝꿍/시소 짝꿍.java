import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        Arrays.sort(weights);
        for(int i = 0; i<weights.length; i++){
            for(int j = weights.length-1; j>i; j--){
                if(weights[i] == weights[j]){
                    answer++;
                    continue;
                }
                
                if(weights[j]*2 == weights[i]*3 ||
                   weights[j]*2 == weights[i]*4 ||
                   weights[j]*3 == weights[i]*4
                  )answer++;
            }
        }        
        
        return answer;
    }
}