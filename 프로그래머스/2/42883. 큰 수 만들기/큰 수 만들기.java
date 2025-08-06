class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int maxIndex = 0;
        
        // 가장 큰 수 인덱스 찾기 + 자리 설정 반복
        while (answer.length() + (number.length() - maxIndex) != number.length() - k
              && answer.length() != number.length() - k
              ) {
            char maxChar = '0';
            for (int i = maxIndex; i <= k + answer.length(); i++) {
                if (number.charAt(i) > maxChar) {
                    maxChar = number.charAt(i);
                    maxIndex = i;
                }
            }
            answer += maxChar;
            maxIndex++;
        }
        return answer.length() == number.length() - k ? answer : answer + number.substring(maxIndex);
    }
}