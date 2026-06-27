import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number) return 1;
        
        List<HashSet<Integer>> countList = new ArrayList<>();
        for(int i = 0; i<8; i++) countList.add(new HashSet<>());
        countList.get(0).add(N);
        
        for(int i = 1; i<8; i++){
            HashSet<Integer> curSet = countList.get(i);
            curSet.add(Integer.parseInt(String.valueOf(N).repeat(i+1)));
            
            for(int j = 1; j<=i; j++){
                Set<Integer> leftSet = countList.get(j-1);
                Set<Integer> rightSet = countList.get(i-j);
                
                for(int left : leftSet){
                    for(int right : rightSet){
                        curSet.add(left + right);
                        curSet.add(left - right);
                        curSet.add(left * right);
                        if(right != 0) curSet.add(left / right);   
                    }
                }
            }
            if(curSet.contains(number)) return i+1;
        }
        return -1;
    }
}