import java.util.*;

class Solution {
    
    Map<String, Integer> map;
    
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        
        for(int len : course){
            map = new HashMap<>();
            
            for(String order : orders){
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                
                dfs(arr, 0, len, new StringBuilder());
            }
            
            int max = 0;
            
            for(String key : map.keySet()){
                int count = map.get(key);
                if(count >=2) max = Math.max(max,count);
            }
            
            for(String key : map.keySet()){
                if(map.get(key) == max && max>=2) answer.add(key);
            }
            
        }
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
    
    public void dfs(char[] arr, int start, int targetLength, StringBuilder sb){
        // 문자열 길이가 course의 length만큼 오면
        // map에 넣어서 메뉴가 얼마나 선정되었는지 확인
        if(sb.length() == targetLength){
            String menu = sb.toString();
            map.put(menu, map.getOrDefault(menu,0) +1);
            return;
        }
        
        // 글자 하나씩 넣되, 재귀를 활용해서 조합으로 넣음.
        for(int i = start; i< arr.length; i++){
            sb.append(arr[i]);
            dfs(arr, i+1, targetLength, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        
        
    }
}