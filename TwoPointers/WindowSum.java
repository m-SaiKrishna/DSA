package TwoPointers;
import java.util.*;
public class WindowSum{

    public static void main(String[] args) {
        int[] arr = {1,3,4,0};
        int k = 2;
        int s = 4;
        List<Boolean> ans = new ArrayList<>();
        ans = windowSum(arr, k, s);
        System.out.println(ans);
    }

    public static List<Boolean> windowSum(int[] arr, int k, int s){
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i <= arr.length-k; i++){
            int sum = 0;
            int r = i,  l = i;
            while(r < i+k){
               sum += arr[r];
               r++;
            }
            ans.add(sum == s);

        }


        return ans;
    }
}