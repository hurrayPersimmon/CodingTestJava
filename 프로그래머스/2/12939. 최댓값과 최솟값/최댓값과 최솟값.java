class Solution {
    public String solution(String s) {
        String answer = "";
        String numberArray[] = s.split(" ");
        int min = Integer.parseInt(numberArray[0]);
        int max = Integer.parseInt(numberArray[0]);
        
        for(String number : numberArray){
            min = Math.min(min, Integer.parseInt(number));
            max = Math.max(max, Integer.parseInt(number));
            
        }
        answer = min + " " + max;
        return answer;
    }
}