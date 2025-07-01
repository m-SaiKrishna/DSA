package Stacks;
import java.util.*;
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str  = sc.nextLine();
        System.out.println(balancesParentheses(str));
    }

    public static boolean balancesParentheses(String str){
        if(str.length() == 0) return true;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( !st.isEmpty() && ch == '[' || ch == '{' || ch == '(') st.push(ch);
            
            else if(!st.isEmpty()){
                if(ch == ']' && st.pop() == '[') st.pop();
                else if(ch == '}' && st.pop() == '{') st.pop();
                else if(ch == ')' && st.pop() == '(') st.pop();
             }
        }

        return st.isEmpty();
    }
}


