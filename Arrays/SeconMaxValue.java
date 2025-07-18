import java.util.*;
public class SeconMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(secondName(arr, n));
    }   

    public static int secondName(int[] nums, int n){
        int fMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > fMax) fMax = nums[i];

        }
        int sMax = Integer.MIN_VALUE;
        for(int i = 0; i <n; i++){
            if(fMax != nums[i] && nums[i] > sMax){
                sMax = nums[i];
            }
        }
        return sMax;
    }
}
