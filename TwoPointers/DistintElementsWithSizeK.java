package TwoPointers;
import java.util.*;

public class DistintElementsWithSizeK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(distinstElementsWithKSize(arr, k));
    }

    public static int  distinstElementsWithKSize(int[] arr, int k){
        //List<Integer> ans = new ArrayList<>();
        int max = 0;
        for(int i = 0; i  <= arr.length - k; i++){
           Set<Integer> st = new HashSet<>();
           int sum = 0, l = i, r = i;
           while(r < i + k){
                if(!st.contains(arr[r])){
                    sum += arr[r];
                    st.add(arr[r]);
                    r++;
                }
                else{
                    sum = 0;
                    break;
                }

           }
        //    for(int ele : st) sum += ele;
           max = Math.max(sum,max);
        //    max = Math.max(sum,max);
        }


        return max;
    }
}
