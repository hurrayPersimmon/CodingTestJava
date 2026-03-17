class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order >= 1){
            int target = order % 10;
            if(target % 3 == 0 && target != 0) answer++;
            order /= 10;
        }
        
        return answer;
    }
    
}