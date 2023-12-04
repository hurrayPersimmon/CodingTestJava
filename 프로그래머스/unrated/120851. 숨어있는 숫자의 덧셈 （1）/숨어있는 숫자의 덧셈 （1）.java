class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(String str : my_string.split("")){ 
            try {
                answer += Integer.parseInt(str);
            }catch(NumberFormatException error){
                continue;
            }
        }
        return answer;
    }
}