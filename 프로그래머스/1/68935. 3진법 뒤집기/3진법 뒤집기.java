class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = Integer.toString(n,3);
        String numArray[] = number.split("");
        number = "";
        
        for(int i = numArray.length-1; i>=0; i--){
            // if(numArray[i].equals("0")) continue;
            number += numArray[i];
        }
        answer = Integer.parseInt(number, 3);
        return answer;
    }
}