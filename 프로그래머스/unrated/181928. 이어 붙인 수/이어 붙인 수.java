class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for(int i : num_list){
            if(i % 2 == 1){
                sumOdd = sumOdd*10 + i;
            }else{
                sumEven = sumEven*10 +i;
            }
            
        }
        answer = sumOdd + sumEven;
        return answer;
    }
}