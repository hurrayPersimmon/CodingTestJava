class Solution {
    public int solution(String s) {
        int answer = 0;
        int pre = 0;
        
        for(String str : s.split(" ")){
            if(str.equals("Z")){
                answer -= pre;
                
            }else{
                answer += Integer.parseInt(str);
                pre = Integer.parseInt(str);
                                
            }
        }
        return answer;
    }
}
