class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int frontMax = 0;
        int backMax = 0;
        
        // 값 오름차순 정렬 이후 값 비교
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0] > frontMax) frontMax = sizes[i][0];
            if(sizes[i][1] > backMax) backMax = sizes[i][1];
        }
        answer = frontMax * backMax;
        return answer;
    }
}