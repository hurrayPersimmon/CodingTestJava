import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] tuple = s.split("},");
        Arrays.sort(tuple, Comparator.comparingInt((String elements) -> countElement(elements)));
        
        int[] answer = new int[tuple.length];
        int elementSum = 0;
        int index = 0;
        for(String elements : tuple){
            int sum = 0;
            elements = elements.replaceAll("\\{", "");
            elements = elements.replaceAll("}", "");
            for(String element : elements.split(",")){
                sum += Integer.parseInt(element);
            }      
            answer[index++] = sum - elementSum;
            elementSum = sum;
        }
        return answer;
    }
    
    public int countElement(String elements){
        return elements.length() - elements.replaceAll(",", "").length();
    }
}