import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> reporting = new HashMap<>();

        // key 신고 당한사람 value가 신고 한사람.    
        for(String str : report){
            String[] array = str.split(" ");
            if(reporting.containsKey(array[1])){
                HashSet<String> set = reporting.get(array[1]);
                set.add(array[0]);
                reporting.put(array[1], set);
            }else{
                HashSet<String> set = new HashSet<>();
                set.add(array[0]);
                reporting.put(array[1], set);
            }
        }
        
        //메일 받으려면 k번 이상 신고 당해야 함.
        int index = 0;
        for(String id : id_list){ 
            if(reporting.containsKey(id) && reporting.get(id).size() >= k){
                //value에 해당하는 사람의 answer 값 증가
                for(String name : reporting.get(id)){
                    answer[findIndexById(name, id_list)] +=1;
                }
            }
        } 
        return answer;
    }
    
    public int findIndexById(String name, String[] id_list){
        int index = 0;
        for(String id : id_list){
            if(id.equals(name)) return index;
            index++;
        }
        return -1;
            
    }
    
}