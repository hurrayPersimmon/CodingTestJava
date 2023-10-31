class Solution {
    public long solution(long num) {
        //int가 커져서 오버플로우 발생하여 long으로 타입변환.
        long answer = -1;
        for(long i=0; i<500; i++){
            if(num == 1) return i;
            
            if(num%2 == 0) num /= 2;
            else num = num * 3 + 1 ;
        }
        
        return answer;
    }
}