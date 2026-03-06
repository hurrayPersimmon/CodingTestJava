import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = numbers[0];
        int next = 1;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
            
        return answer;
        
    }
}