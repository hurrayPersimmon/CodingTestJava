import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Set<String> runners = new HashSet<>();
        
        for (String runner: participant) {
            if (!runners.contains(runner)) {
                runners.add(runner);
            } else {
                runners.remove(runner);
            }
        }
        
        for (String runner: completion) {
            if (runners.contains(runner)) {
                runners.remove(runner);
            } else {
                runners.add(runner);
            }
        }
        
        for (String ans: runners) {
            return ans;
        }
        
        
        
        
//         for(int i = 0; i<completion.length; i++){
//             for(int j = 0; j<participant.length; j++){
//                 if(completion[i].equals(participant[j])){
//                     completion[i] = "";
//                     participant[j] = "";
//                     break;
//                 }
//             }
//         }
//         for(String runner : participant) if(!runner.equals("")) return runner;
        
        // List<String> completionList = new ArrayList<>(Arrays.asList(completion
        // for(String name : participant){
        //     if(!completionList.contains(name)) return name;
        //     else completionList.remove(name);        
        // }
        return null;
    }
}
