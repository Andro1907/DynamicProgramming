public class MinCost {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        int min = minCost(cost);
        System.out.println(min);
    }
    public static int minCost(int[] cost){
        int n = cost.length;
        if(n == 2)
            return Math.min(cost[0],cost[1]);
        int first = cost[0];
        int second = cost[1];
        for(int i = 2;i<cost.length;i++){
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[n-1],cost[n-2]);
    }
}
