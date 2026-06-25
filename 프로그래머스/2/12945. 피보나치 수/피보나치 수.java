class Solution {
    static int[] f;
    public int solution(int n) {  
        // int answer = fibonnachi(n);
        f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        
        int answer = bottomUp(n);
        // int answer = topDown(n);
        return answer%1234567;
    }
    
    public int fibonnachi(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        return fibonnachi(n-1) + fibonnachi(n-2);
    }
    
    public int bottomUp(int n){
        for(int i = 2; i<n+1; i++){
            f[i] = f[i-2]%1234567 + f[i-1]%1234567;
        }
        return f[n];
    }
    
    public int topDown(int n){
        if(n == 1 || n == 2) return 1;
		if(f[n] != 0) return f[n];
		f[n] = topDown(n-1) % 1234567 + topDown(n-2) % 1234567;
		return f[n];
        
    }
    
}