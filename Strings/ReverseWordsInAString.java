import java.util.*;
class ReverseWordsInAString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseStringsInAWord(str);
        System.out.println(ans);
    }

    public static String reverseStringsInAWord(String str){
        StringBuilder st = new StringBuilder();
        String[] arr = str.split("\\s+");
        for(int i = arr.length - 1; i >= 0; i--){
            st.append(arr[i]);
            if(i != 0) st.append(" ");
        }
        return st.toString().trim();
    }
}



