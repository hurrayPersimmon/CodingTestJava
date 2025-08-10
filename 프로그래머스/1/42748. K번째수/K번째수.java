import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            answer[i] = arrayCut(commands[i][0], commands[i][1], commands[i][2], array);
        }
        
        return answer;
    }
    
    private int arrayCut(int i, int j, int k, int[] array){
        int[] result = new int[j-i+1];
        int index = 0;
        for(int ind = i-1; ind<j; ind++){
            result[index] = array[ind];
            index++;
        }
        Arrays.sort(result);
        return result[k-1];
    }
    
}