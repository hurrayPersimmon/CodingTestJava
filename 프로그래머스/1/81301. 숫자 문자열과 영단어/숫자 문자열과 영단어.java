class Solution {
    public int solution(String s) {
        int answer = 0;
        
        try{
            answer = Integer.parseInt(s);
            return answer;
        
        }catch(NumberFormatException e){
            String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            
            for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
            }
//             s = s.replace("zero","0");
//             s = s.replace("one","1");
//             s = s.replace("two","2");
//             s = s.replace("three","3");
//             s = s.replace("four","4");
//             s = s.replace("five","5");
//             s = s.replace("six","6");
//             s = s.replace("seven","7");
//             s = s.replace("eight","8");
//             s = s.replace("nine","9");
            
            answer = Integer.parseInt(s);
            return answer;            
        }
        
    }
    

}