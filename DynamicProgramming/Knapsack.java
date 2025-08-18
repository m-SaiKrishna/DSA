package DynamicProgramming;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt = {1,1,1};
        int [] pt = {10,20,30};
        System.out.println("Memoized: " + knapsack(wt, pt, 2));
        System.out.println("Tabulation: " + knapsackTabulation(wt, pt, 2));
    }

    public static int knapsack(int[] wt, int[] pt, int w){
        int n = pt.length;
        int[][] dp = new int[n+1][w+1];
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= w; j++){
                    dp[i][j] = -1;
                }
            }
            return helper(wt, pt, n, w, dp);
    }


    public static int helper(int[] wt, int[] pt, int n, int w, int[][] dp){


        if(n == 0 || w == 0) return 0;

        if(dp[n][w] != -1) return dp[n][w];

        int pick = 0;

        if(wt[n - 1] <= w){
             pick = pt[n-1] + helper(wt, pt, n - 1, w - wt[n - 1], dp);
        }
        int notpick = helper(wt, pt, n - 1, w, dp);

        return dp[n][w] = Math.max(pick, notpick);
    }

    // Bottom-up (tabulation) DP solution for 0/1 Knapsack
    public static int knapsackTabulation(int[] wt, int[] pt, int w) {
        int n = pt.length;
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(pt[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }
}
