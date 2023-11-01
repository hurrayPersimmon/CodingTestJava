class Solution {
    public long solution(long n) {
        long answer = 0; 
        answer = Math.sqrt(n)%1 > 0.0 ?
            -1 : ((long)Math.sqrt(n)+1)*((long)Math.sqrt(n)+1);
            
        return answer;
    }
}