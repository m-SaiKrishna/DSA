import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarraySumAfterDeletion {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1};
        System.out.println(maxSum(arr));
    }


     public static int maxSum(int[] nums) {
        // if(nums.length == 1 && nums[0] < 0) return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            if(!set.contains(ele)){
                set.add(ele);
            }
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for(int el : set){
            if(el > 0)
                sum += el;
            if(el > max && el <= 0)
                max = el;
        }
        
    
    return sum >0 ?sum:max;
    }
}
