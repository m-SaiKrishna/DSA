import java.util.*;
class AddFractions{
public static void main(String args[]){
   String[] arr = {"2/6+2/6", "13/10+17/10"};

for(String st : arr) {
    String[] ans = st.split("\\+"); // split each string by '+'
    // String[] ans = st.split("\\+"); // split each string by '+'
    
    for(int i = 0; i < ans.length; i++) {
        System.out.println(ans[i]); // print each fraction
    }
}
}

public static void addFractions(String[] arr){
    List<String> list = new ArrayList<>();
    for(int i = 0; i < arr.length; i++){
        String in = arr[i];
        String st = "";
        for(int j = 0; j < in.length(); j++){
            if(in.charAt(j) == '+') {
                list.add(st);
                st = "";

            }
            else{
                st += in.charAt(j);
            }
        }
        list.add(st);
    }

    for(String ele : list) System.out.println(ele);
}
}