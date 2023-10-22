class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = a+b;
        
        long amount = Math.abs(b-a) +1;
        answer = amount * sum /2;
        return answer;
    }
}