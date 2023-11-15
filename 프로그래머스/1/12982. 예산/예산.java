class Solution {
    public int solution(int[] d, long budget) {
        int answer = d.length;
        int sum = 0;
        for(int num : d) sum += num;

        while(sum > budget){
            int max = 0;
            int index = 0;
            for(int i= 0; i<d.length; i++){
                if(d[i] > max){
                    max = d[i];
                    index = i;
                }
            }
            sum -= max;
            answer--;
            d[index] = 0;
            
        }
        return answer;
    }
}