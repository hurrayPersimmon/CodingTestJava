class Solution {
    public String solution(String my_string) {
        String answer = "";
        String strArr[] = my_string.split("");
        for(int i = strArr.length-1; i>= 0; i-- ){
            answer += strArr[i];
        }
        return answer;
    }
}