class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int result = 0;
        for(char x : s.toCharArray()){
            if(x == 'p' || x == 'P') result++;    
            else if(x == 'y' || x == 'Y') result--;
        }
        return answer = result == 0 ? true : false;
    }
}