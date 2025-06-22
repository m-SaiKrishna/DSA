import java.util.*;
public class DivideAStringIntoGroupsofSizek {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        char fill = sc.next().charAt(0);
        divideString(str,k,fill);

    }

    public static void divideString(String s, int k, char fill) {
        int len = s.length();
        // 8 + 1  11 +1 5 +1 22 + 2
        if(len % k == 0){
            for(int i=0;i<s.length();i+=k){
                
                    System.out.println(s.substring(i, i+k));
                
            }
        }
        else{
                int filled = len / k;
                String str = generateString(filled,fill);
                for(int i=0;i+k <= s.length(); i+=k){
                
                    System.out.println(s.substring(i, i+k));
                
            }   
                String lastString =  s.substring(len - (len % k)) + str;
                System.out.println(lastString);

             
                
            }
        }

        public static String generateString(int filled, char ch){
            StringBuilder st = new StringBuilder();
            for(int i = 0 ; i < filled ; i++){
                st.append(ch);
            }
            return st.toString();
        }
    }


