class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1) answer = 1;
        for(int i = 1; i<n; i++){
            if(i % 2 ==1){
                if( n / i - i /2 > 0 &&
                    n % i == 0) answer++;
            }else{
                if((n+ (i/2) )/ i - i/2 > 0 &&
                   (n+ (i/2)) % i == 0) answer++;
            }
        }
        return answer;
    }
}