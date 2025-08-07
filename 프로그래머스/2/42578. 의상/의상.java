import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();
        clothesMap.put(clothes[0][1], 1);
        for(int i = 1; i<clothes.length; i++){
            // clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 1) + 1);
            if(clothesMap.containsKey(clothes[i][1])){
                clothesMap.put(clothes[i][1], clothesMap.get(clothes[i][1]) + 1);    
            }else{
                clothesMap.put(clothes[i][1], 1);
            }
        }
        
        for(Integer value : clothesMap.values()){
            answer *= (value+1);
            
        }
        return answer -1 ;
    }
}