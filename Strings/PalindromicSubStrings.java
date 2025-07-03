import java.util.*;
public class PalindromicSubStrings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();

        // int ans = palindromicSubStrings(str);
        int ans = dpApproach(str);
        System.out.println(ans);
    }

public static int dpApproach(String str){
    //int ans = 0;
    int n = str.length();
    boolean[][] dp = new boolean[n][n];
    for(int i = 0; i < n; i++) dp[i][i] = true;
    for(int len = 2; len <= n; len++){
        for(int  i = 0; i <= n - len; i++){
            int j = i + len - 1;
            if(str.charAt(i) == str.charAt(j)){
                if(len == 2 || dp[i+1][j-1]) {
                    dp[i][j] = true;
                }
            }
        }
    }

    int cnt = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(dp[i][j]) cnt++;
        }
    }
    
        return cnt;
    }












    // public static int palindromicSubStrings(String str){
    //     int max = 0;
    //     for(int i = 0; i < str.length(); i++){
    //         for(int j = i + 1; j <= str.length(); j++){
    //                 String temp = reverseString(str.substring(i,j));
    //                 if(isPalindrome(str.substring(i,j), temp)) {
    //                     max = Math.max(max, temp.length());
    //                 }
    //         }
    //     }
    //     return max;
    // }

    // public static boolean isPalindrome(String str1, String str2){
    //     return str1.equals(str2);
    // }

    // public static String reverseString(String str){
    //     StringBuilder st = new StringBuilder(str);
    //     return st.reverse().toString();
    // }
}
