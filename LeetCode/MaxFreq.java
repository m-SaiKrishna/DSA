import java.util.Arrays;
public class MaxFreq {
    public static void main(String[] args) {
        String str = "leetcode";
        
        System.out.println(maxFreqSum(str));
    }




    
    public static int maxFreqSum(String s) {
        int[] vowel = new int[26];
        int[] consonants = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isvowel(ch)){
            int f = ch - 'a';
            vowel[f]++;
            }
            else{
            int f = ch - 'a';
            consonants[f]++;
            }
        }
        Arrays.sort(vowel);
        Arrays.sort(consonants);
        return vowel[vowel.length-1]+consonants[consonants.length-1];
    }

    public static boolean isvowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }

}
