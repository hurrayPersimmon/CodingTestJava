class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0,0);
    }
    
    public int dfs(int[] numbers, int target, int result, int count){
        if(count == numbers.length){
            return target == result? 1: 0;
        }
        
        int minus = dfs(numbers, target, result - numbers[count], count+1);
        int plus = dfs(numbers, target, result + numbers[count], count+1);
        
        return minus + plus;
    }
}