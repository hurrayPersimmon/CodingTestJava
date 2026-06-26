class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int length = land[0].length;
        
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<length; j++){
                land[i+1][j] += getNext(j, land[i]);
            }
        }
        
        for(int k : land[n-1]) answer = Math.max(k, answer);
        return answer;
    }
    
    public int getNext(int index, int array[]){
        int max = 0;
        for(int i = 0; i<array.length; i++){
            if(i == index)continue;
            max = Math.max(max, array[i]);
        }
        
        return max;
    }
    
    
    
}