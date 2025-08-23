import java.util.*;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length-1,ans = Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid - 1;
            }

            
    }
        return ans;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++) arr[i] = sc.nextInt();
    // for(int i = 0; i<arr.length; i++) arr[i] = sc.nextInt();
    int minimumElement = findMin(arr);
    System.out.println(minimumElement);
}
}
