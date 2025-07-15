import java.util.*;
public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        System.out.println(lengthOfLIS(arr));
    }
   
//     public static int lengthOfLIS(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        list.add(nums[0]);
//        for(int i = 0; i < nums.length; i++){
//         if(nums[i] > list.get(list.size() - 1)){
//             list.add(nums[i]);
//         }
//         else{
//             int ind = Collections.binarySearch(list,nums[i]);
//             if(ind < 0) {
//                 ind = -ind - 1;
//             }
//             list.set(ind,nums[i]);
//         }
//        }
//        return list.size();
// }


public static int lengthOfLIS(int[] nums) {
    return longestIncreaseSequence(nums, 0, -1);
}

public static int longestIncreaseSequence(int[] nums,int ind, int prev){
 
    if(ind == nums.length) return 0;

    int len = 0 + longestIncreaseSequence(nums, ind+1, prev);
    if(prev == -1 || nums[ind] > nums[prev]){
        len = Math.max(len, 1 + longestIncreaseSequence(nums, ind + 1, ind));
    } 
    return len;
}
}
