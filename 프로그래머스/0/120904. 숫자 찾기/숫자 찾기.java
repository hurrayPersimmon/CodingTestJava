class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        String numberToString = Integer.toString(num);
        String targetNumber = Integer.toString(k);
        for(String string : numberToString.split("")){
            if(string.equals(targetNumber)) return answer;
            answer++;
        }
        
        return -1;
    }
}