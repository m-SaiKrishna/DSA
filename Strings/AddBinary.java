import java.util.*;
class AddBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Map<String,Integer> map = addBinary(str1, str2);
        System.out.println(map);
       
    }
       

    public static Map<String,Integer> addBinary(String str1, String str2){
        StringBuilder st = new StringBuilder();
        int i = str1.length() - 1 , j = str2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0) sum += str1.charAt(i) - '0';
            // if(i >= 0) sum += str1.charAt(i) - '0';
            if(j >= 0) sum += str2.charAt(j) - '0';
            st.append(sum % 2);
            carry = sum / 2;
            i--; 
            j--;
        }
            HashMap<String,Integer> map = new HashMap<>();
            String ans = st.reverse().toString();
            int num = binaryToDecimal(ans);
            map.put(ans, num);
        return map;
        
        }

        public static int binaryToDecimal(String str){
            int ans = 0;
            int i = str.length()-1, p = 0;
            while(i >= 0){
                if(str.charAt(i) == '1'){
                    ans +=(int)Math.pow(2, p);
                    
                }
                i--;
                p++;
            }
            
                return ans;
            
            }
}
            
            






            


