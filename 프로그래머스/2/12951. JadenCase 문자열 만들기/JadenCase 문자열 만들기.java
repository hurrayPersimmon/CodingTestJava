class Solution {
    public String solution(String s) {
        String answer = "";
        String strArr[] = s.split(" ");
        int stringLength = s.length();
        int lengthCount = 0;
        
        for(String split : strArr){
            split += " ";
            answer += split.substring(0,1).toUpperCase();
            
            if(split.length() != 1){
                answer += split.substring(1).toLowerCase();
            }
            
            lengthCount += split.length();
        }
        
        int lengthDif = stringLength - lengthCount +1;
        if(lengthDif != 0) answer += " ".repeat(lengthDif);
        return answer.substring(0,answer.length()-1);
    
    }
}