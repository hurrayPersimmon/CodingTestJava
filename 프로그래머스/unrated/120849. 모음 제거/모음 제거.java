class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] array = {"a","e","i","o","u"};
        for(String i : array){
            my_string = my_string.replace(i, "");
        }
        answer = my_string;
        return answer;
    }
}