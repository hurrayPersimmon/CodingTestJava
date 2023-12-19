class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(String string : my_string.split("")){
            answer += string.repeat(n);
        }
        return answer;
    }
}