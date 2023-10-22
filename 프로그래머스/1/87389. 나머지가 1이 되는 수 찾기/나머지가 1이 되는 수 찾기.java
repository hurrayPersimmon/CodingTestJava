class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 2;
        while(true){
            if(n%temp == 1) {
                answer = temp;
                temp = -1;
                break;
                
                
            }
            else temp++;
        }
        return answer;
    }
}