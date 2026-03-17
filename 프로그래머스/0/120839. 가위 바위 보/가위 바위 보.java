class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(String str : rsp.split("")){
            if(str.equals("2"))answer += "0";
            if(str.equals("5"))answer += "2";
            if(str.equals("0"))answer += "5";
        }
        return answer;
    }
}