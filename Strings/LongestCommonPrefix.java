import java.util.*;
public class LongestCommonPrefix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }

    public static String  longestCommonPrefix(String[] strs){
        StringBuilder st = new StringBuilder();
        Arrays.sort(strs);
        String firststr = strs[0];
        String laststr = strs[strs.length-1];
        for(int i=0;i<Math.min(firststr.length(),laststr.length());i++){
            if(firststr.charAt(i) != laststr.charAt(i)){
                return st.toString();
            }
            else{
                st.append(firststr.charAt(i));
            }
        }
        
                return st.toString();
            } 
        }



