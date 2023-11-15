class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        
        int[] answer = new int[arr.length -1];
        int min = arr[0];
        int index = 0;
        int count = 0;
        
        for(int i : arr){
            if(i < min) {
                min = i;
                count = index;
                }
            index++;
        }
        
        for(int i = 0; i<arr.length; i++){
            if(i < count)answer[i] = arr[i];
            else if(i == count) continue;
            else answer[i-1] = arr[i];
        }
        
        return answer;
    }
}