class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        answer = countDuplication(array, n);
        return answer;
    }
    
    public int countDuplication(int[] array, int n){
        int count = 0;
        for(int num : array){
            if(num == n) count++;
        }
        return count;
    }
}