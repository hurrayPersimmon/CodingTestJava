import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, 
            Comparator.comparing((String file) -> getHeadLowerCase(file))
            .thenComparingInt(file -> getNumber(file))
        );
        
        return files;
    }
    
    public String getHeadLowerCase(String file){
        String head = "";
        for(int i = 0; i<file.length(); i++){
            char x = file.charAt(i);
            if(Character.isDigit(x)) break;
            head += Character.toLowerCase(x);
        }
        return head;
    }
    
    public int getNumber(String file){
        int number = 0;
        boolean isNumber = false;
        for(int i = 0; i<file.length(); i++){
            char x = file.charAt(i);
            if(Character.isDigit(x)){
                number = number *10 + (x - '0');
                isNumber = true;
            }
            if(isNumber == true && !Character.isDigit(x)) break;
        }
        return number;
    }
}