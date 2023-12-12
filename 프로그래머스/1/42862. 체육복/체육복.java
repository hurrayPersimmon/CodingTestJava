import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 중복 체크
        for(int i = 0 ; i < lost.length; i++){
            for(int j = 0;  j <reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -2;
                    reserve[j] = -4;
                    answer++;
                }
            }
        }
        
        // 범위 내에 있으면 체육복을 준다 숫자가 작은 순서대로.
        for(int lostNum : lost){
            for(int i = 0;  i <reserve.length; i++){
                if(lostNum -1 == reserve[i] || lostNum +1 == reserve[i]){
                    answer++;
                    reserve[i] = -2;
                    break;
                }
            }
        }        
        
        return answer;
    }
}