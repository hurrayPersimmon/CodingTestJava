import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> runners = new HashMap<>();
        for(String runner : completion){
            if(runners.containsKey(runner)){
                runners.put(runner, runners.get(runner)+1);
            }else{
                runners.put(runner, 1);
            }
        }
        
        for(String complete : participant){
            
            if(!runners.containsKey(complete) || runners.get(complete) == 0) return complete;
            
            runners.put(complete, runners.get(complete)-1);
        }
        return "";
    
    }
}
