import java.util.*;

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> total = new HashMap();
        
        for(int i = 0; i<genres.length; i++){
            if(total.containsKey(genres[i])) total.put(genres[i], total.get(genres[i]) + plays[i]);
            else total.put(genres[i], plays[i]);
        }
        
        while(!total.isEmpty()){
            String genre = findGenre(total);
            total.remove(genre);
            listed(genre, genres, plays, answer);
        }
        
        return answer;
    }
    
    private String findGenre(HashMap<String, Integer> total){
        String genre = "";
        int max = 0;
        for(String key : total.keySet()){
            if(total.get(key) > max){
                max = total.get(key);
                genre = key;
            }
        }
        return genre.equals("") ? "" : genre;
    }
    
    private void listed(String genre, String[] genres, int[] plays, List<Integer> answer){ 
        int max = 0;
        int secondMax = 0;
        int index = -1;
        int secondIndex = -1;
        
        for(int i = 0; i<plays.length; i++){       
            if(genres[i].equals(genre)){
                if(plays[i] > max){
                    secondMax = max;
                    secondIndex = index;
                    
                    max = plays[i];
                    index = i;
                }else if(plays[i] > secondMax){
                    secondMax = plays[i];
                    secondIndex = i;
                }
            }
        }
        
        if(index != -1) answer.add(index);
        if(secondIndex != -1) answer.add(secondIndex);
        
        
        
    }
}