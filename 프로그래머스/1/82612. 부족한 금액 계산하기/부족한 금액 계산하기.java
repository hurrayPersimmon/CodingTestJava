class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long 남은돈 = money - count * (1 + count) / 2 * price;
        if(남은돈 < 0) answer -= 남은돈;
        
        // return Math.max(price * (count * (count + 1) / 2) - money, 0);


        return answer;
    }
}