import java.util.*;
public class IsPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isPalindrome(str);
        System.out.println(ans);
}


// public static boolean isPalindrome(String str) {
//         String string1 = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//         int i = 0 , j = string1.length() - 1;
//         while(i < j){
//             if(string1.charAt(i) != string1.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         } 
//            return true;
//     }
}

