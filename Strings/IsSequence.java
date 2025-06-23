import java.util.*;
class IsSequence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = isSequence(s,t);
        System.out.println(ans);
    }
    public static boolean isSequence(String s, String t){
        int i = 0 , j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) 
                i++;
            
            j++;
            //if(s.charAt(i) != t.charAt(j)) j++;

            
        }
        return i == s.length();
    }
}