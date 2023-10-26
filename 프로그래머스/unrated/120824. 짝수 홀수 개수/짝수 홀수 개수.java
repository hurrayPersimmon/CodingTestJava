class Solution {
    public int[] solution(int[] num_list) {
        
        int odd = 0;
        int even = 0;
        
        for(int i : num_list){
            if(i%2 != 0) odd++;
            else even++;
        }
        int[] answer = {even, odd};
        return answer;
    }
}