import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int index = 0;
        for (int b : B) {
            if (b > A[index]) index++;
            if (index == A.length) break;
        }
        return index;
    }
}