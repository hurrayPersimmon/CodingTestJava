class Solution {
    public int solution(int n) {
        int answer = n;
        String number = Integer.toBinaryString(n);
        String nextNumber = "";
    
        int numberOfone = 0;
        int answerOfone = 0;
        for(int i = 0; i<number.length(); i++){
            if(number.charAt(i) == '1') numberOfone++;
        }
        
        while(numberOfone != answerOfone){
            answer++;
            answerOfone = 0;
            nextNumber = Integer.toBinaryString(answer); 
            for(int i = 0; i<nextNumber.length(); i++){
                if(nextNumber.charAt(i) == '1') answerOfone+= 1;
            }
        }
        
        return answer;
    }
}