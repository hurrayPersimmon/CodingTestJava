class Solution {
    public int solution(double flo) {
        int answer = (int)(flo - flo % 1);
        return answer;
    }
}