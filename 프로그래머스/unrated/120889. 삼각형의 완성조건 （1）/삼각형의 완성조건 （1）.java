class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        for(int i : sides){
            if(i> max) max = i;
            sum += i;
        }
        if(sum - max > max) answer = 1;
        else answer = 2;
        
        return answer;
    }
}