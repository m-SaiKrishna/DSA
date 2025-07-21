import java.util.*;
public class DeleteCharactesToMakeFancyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(makeFancyString(str));
    }
    public static String makeFancyString(String s) {
        if(s.length() < 2){
            return s;
        }
        StringBuilder st = new StringBuilder();
        st.append(s.charAt(0));
        st.append(s.charAt(1));
        for(int i = 2; i < s.length(); i++){
            int length = st.length();
            char ch1 = st.charAt(length - 2);
            char ch2 = st.charAt(length - 1);
            if(s.charAt(i) != ch2 || s.charAt(i) != ch1){
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}
