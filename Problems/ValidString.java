import java.util.Scanner;

public class ValidString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       
        System.out.println(isString(str));
    }

    public static int  isString(String str){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
               if(isValid(str.substring(i,j))){
                System.out.println(str.substring(i,j));
                cnt++;
               }
            }
        }
        

        return cnt;
    }


    public static boolean  isValid(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return false;
            }
        }
        return true;
    }
}
