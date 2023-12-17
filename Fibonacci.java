public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int ans = tabu(n);
        System.out.println(ans);
    }
    public static int tabu(int n){
        if(n <= 1)
            return n;
        int prev2 = 0;
        int prev = 1;
        for(int i = 2;i<=n;i++){
            int curr = prev2 + prev;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
