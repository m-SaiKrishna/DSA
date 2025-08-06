import java.util.*;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

     public static List<String> minWindow(String s, String t) {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < s.length()){
            sb.append(s.charAt(i));
            if(s.charAt(i) == t.charAt(j)) j++;
            else if(j == t.length() - 1){
                list.add(sb.toString());
                j = 0;
            }
            i++;
            

        }

        return list;
    }
}
