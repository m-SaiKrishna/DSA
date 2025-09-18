import java.util.*;

public class SortVowelsInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(sortVowels(s));
    }


    
    public static String sortVowels(String s) {
        List<Character> ch = new ArrayList<>();
        // List<Character> ch = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(isVowel(c)){
                ch.add(c);
            }
        }
        Collections.sort(ch);
        int j = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                ans.append(ch.get(j));
                j++;
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }

}