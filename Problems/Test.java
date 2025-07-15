import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cntv = 0, cntc = 0;
        for(int  i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                cntv++;
            }
            else{
            if(Character.isLetter(ch))
             cntc++;
            }
        }
        System.out.println(cntv + " "+ cntc);
    }
}
