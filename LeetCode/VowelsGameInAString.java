public class VowelsGameInAString{

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(doesAliceWin(str));
    }

     public static boolean doesAliceWin(String s) {
        int cnt = isVowel(s);
        if(cnt == 0) return false;
        return true;
    }

    public static int isVowel(String str){
        int cnt = 0;
        for(char ch : str.toCharArray()){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') cnt++;
        }

        return cnt;
    }
}