import java.util.Scanner;

class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }

    public static String  reverseString(String str){
        StringBuilder st = new StringBuilder();
        int i = str.length() - 1;
        while(i >= 0){
            st.append(str.charAt(i));
            i--;
        }

       return st.toString();
    }
}