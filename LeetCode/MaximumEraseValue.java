import java.util.*;
public class MaximumEraseValue {
    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
    }

    public static int maximumUniqueSubarray(int[] nums) {
       int sum = 0, max = 0, l = 0,  r = 0;
         int n = nums.length;
         boolean[] arr = new boolean[10001];
         while(r < n){
            while(arr[nums[r]]){
                sum -= nums[l];
                arr[nums[l]] = false;
                l++;
            }

            sum += nums[r];
            arr[nums[r]] = true;
            if(sum > max){
                max = sum;
            }

            r++;

         }

         return max;
    }
}
