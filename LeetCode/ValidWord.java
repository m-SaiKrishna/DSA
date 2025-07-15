import java.util.*;
public class ValidWord{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(isvowelAndConstant(str));

}

    public static boolean isValid(String word) {
        if(word.length() < 3) return false;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch)) return false;
        }
         if(word.length() >= 3 && isvowelAndConstant(word)) return true;
         return false;
    }
    public static boolean isvowelAndConstant(String word){
        int cntv = 0, cntc = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                cntv++;
            }
            else cntc++;
        }

        return cntv >= 1 && cntc >= 1;
    }

}