import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        // 소요시간을 구하는 것이므로, index가 작은 순서를 고려할 필요가 없음.
        // 따라서, 작업 요청시간이 작은 순서대로 정렬
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingInt((int[] a) -> a[1]) // jobs[i][1] 작업시간
            .thenComparingInt((int[] a) -> a[0]) // jobs[i][0] 요청시간
        );
        
        int length = jobs.length;
        int time = 0;
        int count = 0;
        int index = 0;

        
        while(count < length){
            while (index < jobs.length && jobs[index][0] <= time) {
                pq.offer(jobs[index]);
                index++;
            }
            
            if(pq.isEmpty()){
                time = jobs[index][0];
                continue;
            }
            
            int[] current = pq.poll();
            answer += current[1] + time - current[0];
            time += current[1];
            count++;
            
        }
        
        return answer / jobs.length;
        
    }
}