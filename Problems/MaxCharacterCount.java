import java.util.*;
class MaxCharacterCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        int max = maxFrequencyCharacter(arr, str);
        System.out.println("Max Frequency "+max);
        System.out.println("Max Frequency "+max);
    }
    
    public static int maxFrequencyCharacter(int[]arr,String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int temp = ch - 'a';
            arr[temp]++;
    
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
        
    }
}