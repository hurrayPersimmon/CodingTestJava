class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 != 0) n -=1;
        
        if(n == 2) return n;

        
        if(n%4 == 0){
           answer = (n+2)*(n/4);
        }else{
           answer = (n+2)/2*(n/2);
        }

        return answer;
    }
}