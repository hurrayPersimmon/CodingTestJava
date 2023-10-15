import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] H_Array = new int[T];
        int[] W_Array = new int[T];            
        for(int i = 0; i<T; i++){
            
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int height = N%H;
            if(N<H)height = N;
            if(N%H == 0) height = H;
            int width = N/H +1;
            if(N%H ==0)width--;
            H_Array[i] = height*100;
            W_Array[i] = width;   
        }
        
        for(int i = 0; i<T; i++){
            System.out.println(H_Array[i]+W_Array[i]);  
        }
        
    }
}