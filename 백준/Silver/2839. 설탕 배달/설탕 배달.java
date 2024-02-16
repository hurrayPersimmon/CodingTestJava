import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fiveKG = N/5;
        int threeKG=0;
        
        while(true){
            int temp = N-(fiveKG*5);
            if(temp%3!=0)fiveKG--;
            else {
                threeKG = temp/3;
                break;
            }
            
            if(fiveKG==-1)break;         
        }
        System.out.println(fiveKG+threeKG);
        
    }
}