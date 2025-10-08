import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        return triangle[0][0];
    }
}

// class Solution {
//     public int solution(int[][] triangle) {
//         int answer = 0;
//         int[] array = new int[triangle.length];
        
//         for(int index = 0; index < triangle.length; index++){
//             array[index] = maxNumber(triangle.length-1, index, 0, triangle);
//         }
        
//         for(int num : array){
//             answer = Math.max(num, answer);
//             System.out.print(num + " ");
//         }
    
//         return answer;
//     }
    
//     private int maxNumber(int row, int column, int result, int[][] triangle){ 
//         if(row == triangle.length-1) return maxNumber(row-1, column, triangle[row][column], triangle);
//         if(row == 0) return result += triangle[0][0];
        
//         if(column == 0) return maxNumber(row-1, column, result + triangle[row][column], triangle);
//         if(column == triangle[row].length) return maxNumber(row-1, column-1, result + triangle[row][column-1], triangle);
//         if(triangle[row][column] > triangle[row][column-1]) result += triangle[row--][column];
//         else result += triangle[row--][--column];
//         return maxNumber(row, column, result, triangle);
             
//     }
// }