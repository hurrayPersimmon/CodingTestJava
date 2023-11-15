class Solution {
    public int[] solution(String s) {
        int changeCount = 0;
        int removeZeroCount = 0;
        String resultNumber = "";
        
        while(!s.equals("1")){
            for(String num : s.split("")){
                if(num.equals("1"))resultNumber += "1"; 
                else removeZeroCount++;
            }
            s = Integer.toBinaryString(resultNumber.length());
            resultNumber = "";
            changeCount++;
        }
        
        int[] answer = {changeCount, removeZeroCount};
        
        return answer;
    }
}