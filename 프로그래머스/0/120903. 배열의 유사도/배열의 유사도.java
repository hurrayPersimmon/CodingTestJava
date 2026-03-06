class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str : s1){
            for(String strSecond : s2){
                if(str.equals(strSecond)) answer++;
            }
        }
        
        return answer;
    }
}