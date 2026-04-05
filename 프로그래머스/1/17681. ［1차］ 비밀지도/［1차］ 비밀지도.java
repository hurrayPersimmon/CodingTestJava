class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String [n];
        
        for(int i = 0; i < n; i++){
            answer[i] = "";
            
            int result = arr1[i] | arr2[i];
            
            String binaryString = Integer.toBinaryString(result);
            int length = binaryString.length();
            
            String space = " ";
            answer[i] += space.repeat(n-length);
            
            for(int j = 0; j<length; j++){
                
                if(binaryString.charAt(j) == '1') answer[i] += "#";
                else answer[i] += " ";
            }
            
        }
        
        return answer;
    }
}