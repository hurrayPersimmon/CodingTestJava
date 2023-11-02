class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int[] basket = new int[moves.length];
        int index = 0;
        
        for(int move : moves){
            for(int count= 0; count<board[0].length; count++){
            if(board[count][move-1] != 0){
                //basket에 담고 해당 배열 초기화
                basket[index] = board[count][move-1];
                board[count][move-1] = 0;
                
                if(index!=0 && basket[index] == basket[index-1]){
                    //인형 터뜨리기
                    basket[index] = 0;
                    basket[index-1] = 0;
                    index--;
                    answer+=2;
                }else{
                    index++;
                }
                break;
            }    
            }
            
        }
        return answer;
    }
}