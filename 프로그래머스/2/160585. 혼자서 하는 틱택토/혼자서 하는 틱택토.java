class Solution {
    public int solution(String[] board) {
        int xAmount = 0;
        int oAmount = 0;
        int index = 0;
        String [] tiktaktoe = new String[9];
        for(int i = 0; i<3; i++){
            for(String word : board[i].split("")){
                tiktaktoe[index++] = word;
                if(word.equals("O")) oAmount++;
                if(word.equals("X")) xAmount++;
            }
        }
        
        if(xAmount > oAmount) return 0;
        if(oAmount - xAmount > 1) return 0;
        
        
        int [] win = {123, 456, 789, 741, 852, 963, 753, 159};
        for(int winning : win){
            int first = winning / 100 -1;
            int second = (winning - winning/100*100) /10 -1;
            int third = winning - winning/10*10 -1;
            if(tiktaktoe[first].equals(tiktaktoe[second]) && tiktaktoe[second].equals(tiktaktoe[third])){
                if(tiktaktoe[first].equals("X") && oAmount > xAmount) return 0;          
                if(tiktaktoe[first].equals("O") && xAmount == oAmount ) return 0;
            }   
        }
        
        return 1;
    }
}