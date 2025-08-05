package HashTable;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {10,10,1};
        System.out.println(longestConsecutiveSequence(arr));
    }


    public static int  longestConsecutiveSequence(int[] arr){
        int[] hash = new int[10+1];
        int ans = 1, max = 0;
        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(hash[i] != 0){
                ans++;
            }
            else{
                max = Math.max(max,ans);
                ans = 0;
            }
        }
        return max;
    }
}



