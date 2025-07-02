import java.util.*;
public class LongestCommonSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        // int ans = longestCommonSubString(str1,str2);
       int ans = dpApproach(str1, str2);
        System.out.println(ans);
        
    }


    // public static int longestCommonSubString(String str1, String str2){
    //     int ans = 1;
    //     String minString = str1.length() < str2.length() ? str1 : str2;
    //     String maxString = str1.length() > str2.length() ? str1 : str2;
    //     for(int i = 0; i < minString.length(); i++){
    //         for(int j = i + 1 ; j <=minString.length(); j++){
    //                if(maxString.contains(minString.substring(i, j))) 
    //                ans = Math.max(ans, j - i );
    //             }
    //         }
    //         return ans;
    //     }



        public static int dpApproach(String str1, String str2){
            int max = 1;
            int n = str1.length();
            int m = str2.length();
            int[][] dp = new int[n + 1][m + 1];
           

            for(int i = 1 ; i <= n; i++){
                for(int j = 1 ; j <= m; j++){
                    if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
            return max;
        }

    }


                
