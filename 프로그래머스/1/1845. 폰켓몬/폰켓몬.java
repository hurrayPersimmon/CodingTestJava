import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> poketmons = new HashSet<Integer>();
        for(int num : nums) poketmons.add(num); 
        return answer = poketmons.size() > nums.length / 2? nums.length/2 : poketmons.size();
    }
}