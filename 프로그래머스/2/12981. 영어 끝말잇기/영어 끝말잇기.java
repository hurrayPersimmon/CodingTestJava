class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int index = 0;
        for(String word : words){
            if(index > 0 && !word.substring(0,1).
               equals(words[index-1]
                      .substring(words[index-1]
                                 .length() -1))){
                answer[0] = (index+1)%n == 0 ? n : (index+1) % n;
                answer[1] = (index+1)%n == 0 ? (index+1)/n : (index+1)/n + 1;
                break;
            }
                
            for(int i=0; i<index; i++){

                if(word.equals(words[i])){
                    answer[0] = (index+1)%n == 0 ? n : (index+1) % n;
                    answer[1] = (index+1)%n == 0 ? (index+1)/n : (index+1)/n + 1;
                    index = -1;
                    break;
                }
            }
            if(index == -1)break;
                
            index++;
        }

        return answer;
    }
}