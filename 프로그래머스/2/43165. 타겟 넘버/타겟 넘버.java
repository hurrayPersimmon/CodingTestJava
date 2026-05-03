import java.util.*;

class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        Deque deque = new ArrayDeque<>();
        minus(numbers, 0, 0, target);
        plus(numbers, 0, 0, target);
        return answer;
    }
    
    public void minus(int[] numbers, int index, int result, int target){
        result -= numbers[index];
        if(index == numbers.length-1){
            if(result == target) answer++;
            return;
        }
        minus(numbers, index+1, result, target);
        plus(numbers, index+1, result, target);
    }
    
    public void plus(int[] numbers, int index, int result, int target){
        result += numbers[index];
        if(index == numbers.length-1){
            if(result == target) answer++;
            return;
        }
        minus(numbers, index+1, result, target);
        plus(numbers, index+1, result, target);
    }
    
}