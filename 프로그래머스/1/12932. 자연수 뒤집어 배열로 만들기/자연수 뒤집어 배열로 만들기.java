class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        int[] answer = new int[number.length()];
        for(int i = 0; i< number.length(); i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}