class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            //unicode 0 = 48 9 = 57
            for(int i = 0; i<s.length(); i++){
                if(s.codePointAt(i)<48 || s.codePointAt(i)>57) return false;
        }    
        }else answer = false;
        
        return answer;
    }
    // // Exception의 활용방법
    // if(s.length() == 4 || s.length() == 6){
    //       try{
    //           int x = Integer.parseInt(s);
    //           return true;
    //       } catch(NumberFormatException e){
    //           return false;
    //       }
    //   }
    //   else return false;
}