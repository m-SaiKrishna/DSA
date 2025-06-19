import java.util.*;
class generateTagForVideoCaption{
    public static void main(String args[]){
        String str = "Leetcode daily streak achieved";
        String ans = generateTag(str);
        System.out.println(ans);
    }

    
    public static  String generateTag(String caption) {
        StringBuilder st = new StringBuilder();
        String[] arr = caption.trim().split("\\s+");
        st.append("#");
        for(int i = 0 ; i < arr.length; i++){
          String word = arr[i].replaceAll("[^A-Za-z]", "");
          if(word.isEmpty()) continue;
          if(i == 0 ) 
              st.append(Character.toLowerCase(word.charAt(0)));
          else
              st.append(Character.toUpperCase(word.charAt(0)));

         st.append(word.substring(1).toLowerCase());
        }
        if(st.length() > 100)
            return st.substring(0,100);
        
           
            
        

        return st.toString();
    }

}