import java.io.*;

class Solution {
    public String solution(int[] numbers, String hand) {
      String answer = "";

      int leftHand = 9;
      int rightHand = 11;

      for(int i = 0; i < numbers.length; i++){
        
          numbers[i] -= 1;
          if(numbers[i] == -1) numbers[i] = 10;

          if(numbers[i] % 3 == 0){
              answer += "L";
              leftHand = numbers[i];

          }else if(numbers[i] % 3 == 2){
              answer += "R";
              rightHand = numbers[i];
          }else{
              int leftHandLocation = Math.abs(leftHand/3 - numbers[i]/3);
              if(leftHand %3 == 1) leftHandLocation -= 1;
              
              int rightHandLocation = Math.abs(rightHand/3 - numbers[i]/3);
              if(rightHand %3 == 1) rightHandLocation -= 1;

              if(leftHandLocation == rightHandLocation){
                  String temp = hand.substring(0,1).toUpperCase();
                  answer += temp;

                  if(temp.equals("L")) leftHand = numbers[i];
                  else rightHand = numbers[i];

              }else if(leftHandLocation < rightHandLocation){
                  answer += "L";
                  leftHand = numbers[i];
              }else{
                  answer += "R";
                  rightHand = numbers[i];
              }

          }
      }
      
      return answer;

    }
}