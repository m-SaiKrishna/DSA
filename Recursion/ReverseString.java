public class ReverseString {
    public static void main(String[] args) {
        String str = "Sai";
        String ans = "";
      System.out.println(reverseString(str, str.length() - 1, ans));
    }
    public static String reverseString(String str, int last , String ans){
        if(last < 0) return ans;

        char ch = str.charAt(last);
        ans += ch;
       return reverseString(str, last - 1, ans);
    }
}
