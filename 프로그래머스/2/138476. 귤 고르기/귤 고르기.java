import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // if(k == tangerine.length) answer = k;
        Arrays.sort(tangerine);
        int [] amountTangerine = new int[tangerine.length];
        int index = 0;
        amountTangerine[0] = 1;
        
        for(int i = 1; i<tangerine.length; i++){
            if(tangerine[i] != tangerine[i-1]){
                amountTangerine[++index]++;
            }else{
                amountTangerine[index]++;
            }
        }
        
        Arrays.sort(amountTangerine);
        
        for(int i = amountTangerine.length-1; i>=0; i--){
            if(k - amountTangerine[i] > 0) {
                k -= amountTangerine[i];
                answer++;
            }
            else return ++answer;
            
        }
        return answer;
    }
}