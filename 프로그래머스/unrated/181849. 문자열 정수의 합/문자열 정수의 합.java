class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(String number : num_str.split("")){
            answer += Integer.valueOf(number);
        }
        return answer;
    }
}