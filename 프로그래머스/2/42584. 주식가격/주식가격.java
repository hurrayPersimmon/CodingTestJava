class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;

        for(int i = 0; i<prices.length-1; i++){
            int count = 0;
            int price = prices[i];
            for(int j = i+1; j<prices.length; j++){
                count++;
                if(price > prices[j])break;
            }
            answer[i] = count;
        }
        
        return answer;
    }
}