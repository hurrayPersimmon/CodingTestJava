class Solution {
    public int solution(int hp) {
        int bossAnt = hp/5;
        int soldierAnt = (hp-bossAnt*5)/3;
        int workAnt = hp-bossAnt*5-soldierAnt*3;
        int answer = bossAnt + soldierAnt + workAnt;
        return answer;
    }
}