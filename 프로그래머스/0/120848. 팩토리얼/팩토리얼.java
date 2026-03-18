class Solution {
    public int solution(int n) {
        int answer = 1;
        int number = 1;
        while(n >= number){
            number *= ++answer;
        }
        
        return answer-1;
    }
}