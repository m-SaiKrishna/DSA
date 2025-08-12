package TwoPointers;
import java.util.*;
public class MaxWindowSum{
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maxWindowSum(arr, k));
    }

    public static int maxWindowSum(int[] arr,int k){
        int max = 0;
        for(int i = 0; i <= arr.length - k; i++){
            int sum = 0, j = i;
            while(j < i + k){
                
                sum += arr[j];
                j++;
                
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}