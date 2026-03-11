import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String numberToString = String.valueOf(n);
        String[] arr = numberToString.split("");
        int result = 0;
        Arrays.sort(arr);
        
        
        for(int i= arr.length-1; i>=0; i--){
            answer *=10;
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}