public class ClimbStairs {
    public static void main(String[] args) {
        int n = 5;
        int ans = climb(n);
        System.out.println(ans);
    }
    public static int climb(int n){
        if(n <= 2){
            return n;
        }
        int prev2 = 1;
        int prev = 2;
        for(int i = 2;i<n ;i++){
            int curr = prev2 + prev;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
