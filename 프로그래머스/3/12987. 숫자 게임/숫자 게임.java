import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int index = 0;
        int length = A.length-1;
        for(int num : B){
            int left = index;
            int right = length;
            int mid = left + (right-left)/2;
            
            while(A[mid] >= num){
                right = mid;
                mid = left + (right-left)/2;
                if(mid <= left)break;
            }
            
            if(A[mid] != 0 && A[mid] < num){
                A[index] = 0;
                index++;
            }
        }
        return index;
    }
}