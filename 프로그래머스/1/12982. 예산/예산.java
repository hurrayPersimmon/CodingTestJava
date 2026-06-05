import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;

        for(int price : d){
            sum += price;
            if(sum > budget) return answer;
            answer++;
        }
        return answer;
    }
}